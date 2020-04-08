package com.example.distanceconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convertToKmButton = findViewById(R.id.convertToKmButton);
        Button convertToMilesButton = findViewById(R.id.convertToMilesButton);
        convertMilesToKm(convertToKmButton);
        convertKmToMiles(convertToMilesButton);
    }

    private void convertMilesToKm(Button convertToKmButton) {
        convertToKmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText milesValue = findViewById(R.id.milesValue);
                EditText kilometerValue = findViewById(R.id.kilometerValue);
                Double miles = Double.valueOf(milesValue.getText().toString());
                double kilometer = miles / 0.62137;
                DecimalFormat df = new DecimalFormat("##.##");
                kilometerValue.setText(df.format(kilometer));
            }
        });
    }

    private void convertKmToMiles(Button convertToKmButton) {
        convertToKmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText kilometerValue = findViewById(R.id.kilometerValue);
                EditText milesValue = findViewById(R.id.milesValue);
                Double kilometer = Double.valueOf(kilometerValue.getText().toString());
                double miles = kilometer * 0.62137;
                DecimalFormat df = new DecimalFormat("##.##");
                milesValue.setText(df.format(miles));
            }
        });
    }
}
