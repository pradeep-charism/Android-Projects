package com.example.activitylifecycleandlogging;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.i("APP", "On Create just invoked");
            setContentView(R.layout.activity_main);
            Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onStart() {
            super.onStart();
            Log.i("APP", "On Start just invoked");
            Toast.makeText(getApplicationContext(),"onStart", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onRestart() {
            super.onRestart();
            Log.i("APP", "On Restart just invoked");
            Toast.makeText(getApplicationContext(),"onRestart", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onResume() {
            super.onResume();
            Log.i("APP", "On Resume just invoked");
            Toast.makeText(getApplicationContext(),"onResume", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onPause() {
            Log.i("APP", "On Pause just invoked");
            Toast.makeText(getApplicationContext(),"onPause", Toast.LENGTH_SHORT).show();
            super.onPause();
        }
        @Override
        protected void onStop() {
            Toast.makeText(getApplicationContext(),"onStop", Toast.LENGTH_SHORT).show();
            super.onStop();
        }
        @Override
        protected void onDestroy() {
            Log.i("APP", "On Destory just invoked");
            Toast.makeText(getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT).show();
            super.onDestroy();
        }
}
