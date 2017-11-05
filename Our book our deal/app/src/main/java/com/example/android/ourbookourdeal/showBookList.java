package com.example.android.ourbookourdeal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by a on 11/5/17.
 */

public class showBookList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);
        final ArrayList<book> books = new ArrayList<book>();

        books.add(new book("The Art Of Photography","Ayesha", "400tk", R.drawable.artofphotography));
        books.add(new book("Digital Photography", "Salsabil", "990tk", R.drawable.digital));
        books.add(new book("Understanding Exposure", "Tasneem", "600tk", R.drawable.exposure));
        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, words);
        bookAdapter adapter = new bookAdapter(this, books);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                book Books = books.get(position);
                showBookToOrder orderBook = new showBookToOrder();
                //Log.v("showBookList","before orderBook");
                orderBook.passBook(Books);

                Intent familyIntent = new Intent(showBookList.this, orderBook.getClass());
                startActivity(familyIntent);
            }
        });

    }
}
