package com.example.basicfeaturespoc;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // the 2 buttons defined in the activity_main.xml file
    Button buttonBlue, buttonPink, buttonGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // display the GUI defined in the activity_main.xml file
        setContentView(R.layout.activity_main);
        addBlueInvisibleButton();
        addPinkToDoButton();
        addGreetResetButton();

    }

    private void addBlueInvisibleButton() {
        // retrieve references to the Views defined in the activity_main.xml
        buttonBlue = findViewById(R.id.button_blueInvisible);
        buttonBlue.setOnClickListener(this);
    }

    private void addPinkToDoButton() {
        buttonPink = findViewById(R.id.button_pinkPanther);
        buttonPink.setOnClickListener(this);
    }

    private void addGreetResetButton() {
        // Button is added programmatically to the layout
        buttonGreen = new Button(getApplicationContext());
        buttonGreen.setOnClickListener(this);
        buttonGreen.setText(R.string.green_reset_button);
        buttonGreen.setTextColor(Color.BLACK);
        buttonGreen.setBackgroundColor(Color.parseColor(getString(R.string.light_green_color)));

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.BELOW, buttonPink.getId());
        RelativeLayout relativeLayout_mainScren = findViewById(R.id.relativeLayout_mainScreen);
        relativeLayout_mainScren.addView(buttonGreen, layoutParams);
    }

    /**
     * called when a button from activity_main.xml is clicked
     *
     * @param v the View which triggered the method call: should refer to buttonBlue or buttonPink
     */
    public void toDo(View v) {
        if (v.equals(buttonBlue))
            // buttonBlue was clicked
            // turn the button invisible
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonPink))
            // buttonPink was clicked
            // display a pop-up message for a short duration
            Toast.makeText(getApplicationContext(), "to do to do to do...", Toast.LENGTH_SHORT).show();

        if(v.equals(buttonGreen)){
            buttonBlue.setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(), "Green. Resetting config", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        toDo(v);
    }
}
