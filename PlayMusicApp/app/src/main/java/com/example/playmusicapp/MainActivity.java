package com.example.playmusicapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    MediaPlayer pianoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pianoPlayer = MediaPlayer.create(this, R.raw.piano);

        Switch loopingSwitch = findViewById(R.id.switch_looping);
        loopingSwitch.setOnCheckedChangeListener(this);
    }

    public void playMusic(View v){
        pianoPlayer.start();
    }

    public void pauseMusic(View v){
        if(pianoPlayer.isPlaying()){
            pianoPlayer.pause();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        pianoPlayer.setLooping(isChecked);
    }

    /**
     * good practice: release allocated resources when they are no longer of use
     */
    @Override
    protected void onPause() {
        super.onPause();
        pianoPlayer.release();
    }
}
