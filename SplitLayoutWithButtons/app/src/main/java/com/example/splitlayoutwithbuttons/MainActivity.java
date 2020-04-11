package com.example.splitlayoutwithbuttons;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // but the summary slide at the end of the video mentions that possibility.
        Button button_big = findViewById(R.id.button_big);
        button_big.setBackgroundResource(R.drawable.compass);

        Button button_small = findViewById(R.id.button_small);
        button_small.setBackgroundColor(Color.MAGENTA);
    }
}
