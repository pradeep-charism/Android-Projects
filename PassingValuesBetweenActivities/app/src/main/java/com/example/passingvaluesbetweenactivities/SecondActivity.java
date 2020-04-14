package com.example.passingvaluesbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent caller = getIntent();
        float rating = caller.getFloatExtra("numOfStars", 0);
        TextView ratingViewer = findViewById(R.id.ratingViewer);
        ratingViewer.setText("Thanks for rating!. You have selected: " + rating+ " stars.");
    }
}
