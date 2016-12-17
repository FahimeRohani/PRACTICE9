package com.android.hosein.practice9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextuser;
    EditText editTextpass;
    Button buttonlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        config();


    }

    public void config() {

        editTextuser = (EditText) findViewById(R.id.user);
        editTextpass = (EditText) findViewById(R.id.pass);
        buttonlogin = (Button) findViewById(R.id.login);


    }


}
