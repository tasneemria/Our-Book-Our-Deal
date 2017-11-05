package com.example.android.ourbookourdeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class completeYourOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_your_order);

       /* Button continueBuying = (Button) findViewById(R.id.complete_your_order_buying);

        continueBuying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(completeYourOrder.this, showBookList.class);
                startActivity(familyIntent);
            }
        });*/
    }
}
