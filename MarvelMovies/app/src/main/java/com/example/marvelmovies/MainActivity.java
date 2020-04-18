package com.example.marvelmovies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewTrailersScreen(View v){
        Intent homeScreen = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(homeScreen);

    }
}
