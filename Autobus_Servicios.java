package com.example.autocarsdelpenedes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Servicios extends AppCompatActivity {

    Button Inicio;
    WebView Services;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        Inicio = findViewById(R.id.Btn5);
        Services = findViewById(R.id.Services);

        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Services.getSettings().setJavaScriptEnabled(true);

                Services.loadUrl("https://moovitapp.com/index/ca/transport_p%C3%BAblic-line-NT6-Barcelona-362-925904-10763353-1");

            }
        });

        Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToDoSomething = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentToDoSomething);



            }
        });

    }
}

