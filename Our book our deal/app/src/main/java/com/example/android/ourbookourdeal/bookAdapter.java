package com.example.android.ourbookourdeal;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by l on 11/3/17.
 */

public class bookAdapter extends ArrayAdapter<book> {

    private static final String LOG_TAG = bookAdapter.class.getSimpleName();

    public bookAdapter(Activity context, ArrayList<book> books) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        book books = getItem(position);

        ImageView bookImageView = (ImageView) listItemView.findViewById(R.id.bookPic);
        bookImageView.setImageResource(books.getImageId());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.bookName);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(books.getBookName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.bookPrice);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        priceTextView.setText(books.getPrice());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}

