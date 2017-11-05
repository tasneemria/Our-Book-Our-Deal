package com.example.android.ourbookourdeal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by a on 11/4/17.
 */

public class BuySell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_sell);

        Button buyButton = (Button) findViewById(R.id.buy_book);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(BuySell.this, showBookList.class);
                startActivity(familyIntent);
            }
        });


        Button sellButton = (Button) findViewById(R.id.sell_book);

        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(BuySell.this, sellBook.class);
                startActivity(familyIntent);
            }
        });
    }
}
