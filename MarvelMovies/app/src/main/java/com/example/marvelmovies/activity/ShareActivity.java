package com.example.marvelmovies.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marvelmovies.R;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    public void sendMessage(View v) {
        String textMessage = ((TextView) findViewById(R.id.editMessageBox)).getText().toString();
        Intent sendSms = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:5556"));
        sendSms.putExtra("sms_body", textMessage);
        startActivity(sendSms);
    }

    public void sendMessageDirectly(View v) {
        String textMessage = ((TextView) findViewById(R.id.editMessageBox)).getText().toString();
        String subject = "test test test";

        Intent email = new Intent(Intent.ACTION_SEND, Uri.fromParts("mailto", "pradeep.charism@gmail.com", "null"));
        email.setType("text/plain");
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"pradeep.charism@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, subject);
        email.putExtra(Intent.EXTRA_TEXT, "God Bless you");
        try {
            startActivity(Intent.createChooser(email, subject));
        } catch (ActivityNotFoundException ex) {
        }
    }
}
