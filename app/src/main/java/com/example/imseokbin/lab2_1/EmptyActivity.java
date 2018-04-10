package com.example.imseokbin.lab2_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 *
 */
public class EmptyActivity extends AppCompatActivity {
    Button button0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        Intent passedIntent = getIntent();
        if(passedIntent != null){
            String loginName =passedIntent.getStringExtra("loginName");
            String loginAge = passedIntent.getStringExtra("loginAge");

            Toast.makeText(getApplicationContext(),"Name: " + loginName + " Age: " + loginAge,Toast.LENGTH_LONG).show();


        }

        button0 = (Button) findViewById(R.id.close_btn);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }

        });
    }
}

