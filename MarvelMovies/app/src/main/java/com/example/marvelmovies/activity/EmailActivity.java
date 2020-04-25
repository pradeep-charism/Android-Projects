package com.example.marvelmovies.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marvelmovies.R;

import static com.example.marvelmovies.Config.EMAIL_CLIENT_PROMPT;

public class EmailActivity extends AppCompatActivity {

    ImageButton buttonSend;
    EditText textSubject;
    EditText textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        buttonSend = findViewById(R.id.buttonSend);
        textSubject = findViewById(R.id.editTextSubject);
        textMessage = findViewById(R.id.editTextMessage);

        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String subject = textSubject.getText().toString();
                String message = textMessage.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{getString(R.string.admin_email)});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);

                //need this to prompts email client only
                email.setType(EMAIL_CLIENT_PROMPT);

                startActivity(Intent.createChooser(email, "Choose an Email client :"));

            }
        });
    }

}
