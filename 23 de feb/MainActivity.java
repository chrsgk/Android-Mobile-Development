package com.example.autocarsdelpenedes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button horario;
    Button servicio;
    Button empresa;
    Button contacto;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horario = findViewById(R.id.Btn1);
        servicio = findViewById(R.id.Btn2);
        empresa = findViewById(R.id.Btn3);
        contacto = findViewById(R.id.Btn4);
        menu = findViewById(R.id.Btn14);


        servicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToDoSomething = new Intent(getApplicationContext(), Servicios.class);
                startActivity(intentToDoSomething);
            }
        });

        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToDoSomething = new Intent(getApplicationContext(), Empresa.class);
                startActivity(intentToDoSomething);

            }
        });

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToDoSomething = new Intent(getApplicationContext(), Contacto.class);
                startActivity(intentToDoSomething);

            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToDoSomething = new Intent(getApplicationContext(),Menu.class);
                startActivity(intentToDoSomething);
            }
        });




    }
}