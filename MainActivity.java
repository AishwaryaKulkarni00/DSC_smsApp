package com.example.user.sms_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText mobileno;
   EditText message;
    Button sendsms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobileno = (EditText) findViewById(R.id.editText1);
        message = (EditText) findViewById(R.id.editText2);
        sendsms = (Button) findViewById(R.id.button1);

    }

    public void doSendSms(View view){
        final String num = mobileno.getText().toString();
        final String msg = message.getText().toString();
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);

        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(num, null, msg, null, null);

        Toast.makeText(this, "Message Sent!", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}



