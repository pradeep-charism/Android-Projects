package com.example.smssender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v){
        String textMessage = ((TextView)findViewById(R.id.editMessageBox)).getText().toString();
        Intent sendSms = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:5556"));
        sendSms.putExtra("sms_body", textMessage);
        startActivity(sendSms);
    }
}
