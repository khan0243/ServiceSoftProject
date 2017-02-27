package com.servicesoft.app.mobile.servicesoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.servicesoft.app.mobile.servicesoft.customer.CustomerListActivity;
import com.servicesoft.app.mobile.servicesoft.estimate.EstimateListActivity;
import com.servicesoft.app.mobile.servicesoft.job.JobListActivity;


public class MainActivity extends AppCompatActivity{
    private Button listCustomerButton;
    private Button jobButton;
    private Button estimateButton;
    protected static final String ACTIVITY_NAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCustomerButton = (Button) findViewById(R.id.customerButton);
        listCustomerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, CustomerListActivity.class);
                startActivity(myIntent);
            }
        });

        jobButton = (Button) findViewById(R.id.jobsbutton);
        jobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, JobListActivity.class));
                Log.i(ACTIVITY_NAME, "User clicked Job");
            }
        });

        estimateButton = (Button) findViewById(R.id.estimateButton);
        estimateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EstimateListActivity.class));
                Log.i(ACTIVITY_NAME, "User clicked Estimate");
            }
        });
    }

}





