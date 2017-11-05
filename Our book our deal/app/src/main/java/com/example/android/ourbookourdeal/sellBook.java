package com.example.android.ourbookourdeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sellBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_book);

       /* Button sellBookButton = (Button) findViewById(R.id.sell_book_button);

        sellBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(sellBook.this, showBookList.class);
                startActivity(familyIntent);
            }
        });*/
    }
}
