package com.example.preservepreviousstate;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private final String PREV_COLOR_SAVED = "prev_color_saved";
    private RelativeLayout layout;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // retrieve a reference to the layout defined in the activity_main.xml
        layout = findViewById(R.id.colors_layout);

        RadioGroup radioGroupColors = findViewById(R.id.radioGroup_colors);
        radioGroupColors.setOnCheckedChangeListener(this);

        // if a preferences file named COLOR_PREF already exists, get it
        // otherwise, create one (when required by the associate editor)
        // data stored in this file are for the use of this app only
        SharedPreferences preferences = getSharedPreferences("bkg_colors_preferences", MODE_MULTI_PROCESS);

        // create an editor to read and write from/to the preferences file
        editor = preferences.edit();

        // if the preferences file contains a key 'PREV_COLOR_SAVED', retrieve the associated value
        // and use it to set the background color
        if(preferences.contains(PREV_COLOR_SAVED)){
            int previousColor = preferences.getInt(PREV_COLOR_SAVED, 0);
            layout.setBackgroundColor(previousColor);
        }

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int colorCode = 0;
        switch (checkedId) {
            case R.id.radioButton_bule:
                colorCode = Color.BLUE;
                break;
            case R.id.radioButton_magenta:
                colorCode = Color.MAGENTA;
                break;
            case R.id.radioButton_yellow:
                colorCode = Color.YELLOW;
                break;
        }
        layout.setBackgroundColor(colorCode);
        editor.putInt(PREV_COLOR_SAVED, colorCode);
        editor.commit();
    }
}
