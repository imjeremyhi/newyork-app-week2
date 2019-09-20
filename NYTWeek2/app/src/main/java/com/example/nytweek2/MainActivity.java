package com.example.nytweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView bookmarkButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView bookmarkButton = findViewById(R.id.newsSaveButton);
        bookmarkButton1 = findViewById(R.id.newsSaveButton1);

        //One way of implementing OnClick Listener
        bookmarkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click Registered", Toast.LENGTH_SHORT).show();
                if(bookmarkButton.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ic_bookmark_border_black_24dp).getConstantState()) {
                    bookmarkButton.setImageResource(R.drawable.ic_bookmark_black_24dp);
                } else {
                    bookmarkButton.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
                }
            }
        });

    }

    //Other way of implementing OnClick Listener
    public void saveNewsArticle(View view) {
        Toast.makeText(getApplicationContext(), "Click Registered", Toast.LENGTH_SHORT).show();
        if(bookmarkButton1.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ic_bookmark_border_black_24dp).getConstantState()) {
            bookmarkButton1.setImageResource(R.drawable.ic_bookmark_black_24dp);
        } else {
            bookmarkButton1.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
        }
    }
}
