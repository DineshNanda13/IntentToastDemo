package com.meterstoinches.intenttoastdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button logbutton;
    EditText UN;
    EditText PASS;
    Button photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Logbtn(View view) {
        logbutton = (Button) findViewById(R.id.loginbtn);

        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,Main2Activity.class);
                UN = (EditText) findViewById(R.id.UsernameET);
                PASS = (EditText) findViewById(R.id.PasswordET);

                s.putExtra("Username",UN.getText().toString());
                s.putExtra("Password",PASS.getText().toString());

                startActivity(s);


            }
        });

    }

    public void images(View view) {
        photo = (Button) findViewById(R.id.Photobtn);
        Intent b = new Intent(MainActivity.this,Main3Activity.class);

        startActivity(b);


    }
}
