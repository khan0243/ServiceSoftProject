package com.servicesoft.app.mobile.servicesoft.job;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.servicesoft.app.mobile.servicesoft.R;


public class JobListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_job);
//        Button jobActivityButton = (Button) findViewById(R.id.addJobButton);
//        jobActivityButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                Intent newIntent = new Intent(MainActivity.this, JobsActivity.class);
//                startActivity(newIntent);
//            }
//        });
    }

}
