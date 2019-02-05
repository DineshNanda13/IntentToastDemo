package com.meterstoinches.intenttoastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    ImageView pic;
    Button tost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        pic = (ImageView) findViewById(R.id.leaves);


    }

    public void toast(View view) {
        tost = (Button) findViewById(R.id.toastbtn);
        Toast.makeText(getApplicationContext(),"Image is here",Toast.LENGTH_LONG).show();
    }
}
