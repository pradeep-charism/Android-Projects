package com.example.marvelmovies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewTrailersScreen(View v){
        Toast.makeText(getApplicationContext(), R.string.welcome_message, Toast.LENGTH_SHORT).show();
        Intent homeScreen = new Intent(this, SecondActivity.class);
        startActivity(homeScreen);
    }
}
