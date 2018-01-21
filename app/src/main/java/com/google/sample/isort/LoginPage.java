package com.google.sample.isort;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_main);
        Button loginButton = (Button) findViewById(R.id.loginbutton);
        DataHolder.setData("True");
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Intent intent =  new Intent(LoginPage.this, test.class);
                startActivity(new Intent(LoginPage.this, MainActivity.class));
                //loginButton.setText("CLICKED");
            }
        });
    }


}