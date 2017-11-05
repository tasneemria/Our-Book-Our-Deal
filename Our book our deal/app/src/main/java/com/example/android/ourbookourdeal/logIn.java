package com.example.android.ourbookourdeal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by a on 11/4/17.
 */

public class logIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        Button loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(logIn.this, BuySell.class);
                startActivity(familyIntent);
            }
        });

    }




}
