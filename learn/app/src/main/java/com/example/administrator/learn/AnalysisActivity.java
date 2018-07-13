package com.example.administrator.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnalysisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analysis_layout);
        Button button2= (Button) findViewById(R.id.button_record);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
               Intent intent = new Intent(AnalysisActivity.this,ShowAnalysisActivity.class);
              startActivity(intent);
            }
        });

    }
}
