package com.meterstoinches.intenttoastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText e1;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e1 = (EditText) findViewById(R.id.EditText1);
        e2 = (EditText) findViewById(R.id.EditText2);

        String msg1 = getIntent().getStringExtra("Username");
        e1.setText("Welcome "+msg1);

        String msg2 = getIntent().getStringExtra("Password");
        e2.setText("Your Password is "+msg2);
    }
}
