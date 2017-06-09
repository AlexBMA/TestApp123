package com.example.user.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TestMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);


        int a, b, c;

    }


    public void showInfo(View v) {
        EditText mailTextView = (EditText) findViewById(R.id.email);
        EditText passTextView = (EditText) findViewById(R.id.pass);

        String mail = mailTextView.getText().toString();
        String pass = passTextView.getText().toString();


        Log.e("mail from  interface", mail);
        Log.e("pass from interface", pass);


        TextView resTextView = (TextView) findViewById(R.id.textresult);

        resTextView.setText(" " + mail + " " + pass);

    }
}
