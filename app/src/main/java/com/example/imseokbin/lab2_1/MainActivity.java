package com.example.imseokbin.lab2_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Main Activity gets name and age value from user
 * and send it to next activity
 */
public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Age;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.name);
        Age = (EditText) findViewById(R.id.age);
        button1 = (Button) findViewById(R.id.btn);
        /**
         * button handler for 추가 button
         */
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String s1 = Name.getText().toString();
                String s2 = Age.getText().toString();

                Intent intent = new Intent(getApplicationContext(),EmptyActivity.class);
                intent.putExtra("loginName",s1);
                intent.putExtra("loginAge",s2);
                startActivity(intent);
            }
        });

    }





}