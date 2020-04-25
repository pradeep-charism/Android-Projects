package com.example.marvelmovies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marvelmovies.activity.EmailActivity;
import com.example.marvelmovies.activity.ListYoutubeMainActivity;
import com.example.marvelmovies.activity.ShareViaSmsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewTrailersScreen(View v){
        Toast.makeText(getApplicationContext(), R.string.welcome_message, Toast.LENGTH_SHORT).show();
        Intent homeScreen = new Intent(this, ListYoutubeMainActivity.class);
        startActivity(homeScreen);
    }

    public void shareScreen(View v){
        Toast.makeText(getApplicationContext(), R.string.share_message, Toast.LENGTH_SHORT).show();
        Intent shareScreen = new Intent(this, ShareViaSmsActivity.class);
        startActivity(shareScreen);
    }

    public void askHelp(View v){
        Toast.makeText(getApplicationContext(), R.string.ask_help, Toast.LENGTH_SHORT).show();
        Intent shareScreen = new Intent(this, EmailActivity.class);
        startActivity(shareScreen);
    }
}
