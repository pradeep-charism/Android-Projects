package com.example.passingvaluesbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enterRating(View v){
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        float rating = ratingBar.getRating();
        Toast.makeText(getApplicationContext(), "Selected rating: "+ rating, Toast.LENGTH_SHORT).show();

    }
}
