package com.example.splitlayoutwithbuttons;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // but the summary slide at the end of the video mentions that possibility.
        Button button_big = (Button) findViewById(R.id.button_big);
        button_big.setBackgroundResource(R.drawable.compass);
    }
}
