package com.example.android.ourbookourdeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class showBookToOrder extends AppCompatActivity {

    public static book myBook = null;

    public void passBook(book Book) {
        myBook = Book;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_book_to_order);

//        Log.v("showBookToOrder", "intent call done");

        TextView nameTextView = (TextView) findViewById(R.id.show_book_to_order_bookName);
        TextView authorTextView = (TextView) findViewById(R.id.show_book_to_order_bookWriter);
        TextView priceTextView = (TextView) findViewById(R.id.show_book_to_order_bookPrice);
        ImageView bookImageView = (ImageView) findViewById(R.id.show_book_to_order_bookPic);

        if (myBook != null) {
            nameTextView.setText(myBook.getBookName());
            authorTextView.setText("Author : "+myBook.getBookWriter());
            priceTextView.setText(myBook.getPrice());
            bookImageView.setImageResource(myBook.getImageId());
        }

        Button orderButton = (Button) findViewById(R.id.show_book_to_order_button);

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(showBookToOrder.this, completeYourOrder.class);
                startActivity(familyIntent);
            }
        });

    }
}
