package com.example.autocarsdelpenedes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horario = findViewById(R.id.Btn1);
        servicio = findViewById(R.id.Btn2);
        empresa = findViewById(R.id.Btn3);
        contacto = findViewById(R.id.Btn4);
        web = findViewById(R.id.website);

        horario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.getSettings().setJavaScriptEnabled(true);
                web.loadUrl("https://moovitapp.com/index/en/public_transit-lines-Barcelona-362-925904");
                web.setWebViewClient(new WebViewClient(){
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                        view.loadUrl(request.getUrl().toString());
                        return false;
                    }

                });
            }
        });

        servicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToDoSomething = new Intent(getApplicationContext(),ServiciosWeb.class);
                startActivity(intentToDoSomething);
            }
        });

        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToDoSomething = new Intent(getApplicationContext(),Empresa.class);
                        startActivity(intentToDoSomething);
            }
        });

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToDoSomething = new Intent(getApplicationContext(),Contacto.class);
                        startActivity(intentToDoSomething);
            }
        });


    }

}