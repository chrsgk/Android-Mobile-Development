package com.example.expensesaddition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    TextView texto;
    EditText review2;
    Button newTextBtn;
    Button toast;
    Button activity2;
    Button caller;
    Button message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView texto = (TextView) findViewById(R.id.texto);
        EditText review2 = (EditText) findViewById(R.id.review2);
        Button newTextBtn = (Button) findViewById(R.id.newTextBtn);
        Button toast = (Button) findViewById(R.id.toast);
        Button activity2 = (Button) findViewById(R.id.activity2);
        Button caller = (Button) findViewById(R.id.caller);
        Button message = (Button) findViewById(R.id.message);

        newTextBtn.setOnClickListener(this);
        toast.setOnClickListener(this);
        activity2.setOnClickListener(this);
        caller.setOnClickListener(this);
        message.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.newTextBtn:
                String textFromUser = review2.getText().toString();
                texto.setText(textFromUser);
                break;
            case R.id.toast:
                Toast.makeText(MainActivity2.this, "I am a TOAST", Toast.LENGTH_LONG ).show();
                break;
            case R.id.activity2:
                Intent intentToDoSomething = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentToDoSomething);
                break;
            case R.id.caller:
                Uri telephone = Uri.parse("tel: +34656265905");
                Intent firstTry = new Intent(Intent.ACTION_DIAL, telephone);
                startActivity(firstTry);
                break;
            case R.id.message:
                Uri sms = Uri.parse("sms: to +34656265905");
                Intent firstSMS = new Intent(Intent.ACTION_SENDTO, sms);
                startActivity(firstSMS);
                break;


        }

    }
}