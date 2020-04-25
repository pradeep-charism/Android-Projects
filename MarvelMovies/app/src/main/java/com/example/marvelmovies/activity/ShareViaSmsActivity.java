package com.example.marvelmovies.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marvelmovies.R;

public class ShareViaSmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    public void sendMessage(View v) {
        try{
            TextView textView = findViewById(R.id.editMessageBox);
            textView.setText(getString(R.string.share_via_sms_text));
            EditText mobileNumber = findViewById(R.id.mobileNumber);
            Intent sendSms = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:5556"));
            sendSms.putExtra("sms_body", getString(R.string.share_via_sms_text));
            sendSms.putExtra("address", new String(mobileNumber.getText().toString()));
            startActivity(sendSms);
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error occurred while sending sms", Toast.LENGTH_SHORT).show();
        }
    }
}
