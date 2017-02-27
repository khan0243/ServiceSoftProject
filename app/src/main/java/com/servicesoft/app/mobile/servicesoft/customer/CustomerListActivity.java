package com.servicesoft.app.mobile.servicesoft.customer;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.servicesoft.app.mobile.servicesoft.R;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class CustomerListActivity extends AppCompatActivity {

    private Button addCustomerButton;
    private Button searchCustomerButton;
    private ProgressBar progressBar;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_customer);
        addCustomerButton = (Button) findViewById(R.id.addCustomerButton);
        searchCustomerButton =(Button)findViewById(R.id.queryCustomerButton);
        progressBar = (ProgressBar)findViewById(R.id.progressBar_customer) ;
        searchText = (EditText)findViewById(R.id.searchCustomerText) ;
        addCustomerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(CustomerListActivity.this, AddCustomerActivity.class);
                startActivity(myIntent);
            }
        });
        searchCustomerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String customer_name=searchText.getText().toString();
                GetCustomerListTask getCustomerListTask= new GetCustomerListTask();
                getCustomerListTask.execute(customer_name);


            }
        });
    }

   private class GetCustomerListTask extends AsyncTask<String, Void, String> {
        private Exception exception;

        protected void onPreExecute() {
        progressBar.setVisibility(View.VISIBLE);
        }

        protected String doInBackground(String... customer_name) {
            // Do some validation here

            try {
                StringBuffer url_string= new StringBuffer("https://api.servicesoft.ca/examples/client.php");
              //  if(customer_name!=null)
                //    url_string.append("&filter=first_name cs "+ customer_name);
                URL url = new URL(url_string.toString());
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuilder.append(line).append("\n");
                    }
                    bufferedReader.close();
                    return stringBuilder.toString();
                }
                finally{
                    urlConnection.disconnect();
                }
            }
            catch(Exception e) {
                Log.e("ERROR", e.getMessage(), e);
                return null;
            }
        }

        protected void onPostExecute(String response) {
            if(response == null) {
                response = "THERE WAS AN ERROR";
            }
            progressBar.setVisibility(View.GONE);
            Log.i("INFO", response);
          //  responseView.setText(response);
            System.out.print(response);
        }
    }

}
