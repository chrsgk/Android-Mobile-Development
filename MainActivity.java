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

                web.loadUrl("https://moovitapp.com/index/ca/transport_p%C3%BAblic-line-NT6-Barcelona-362-925904-10763353-1");
                web.setWebViewClient(new WebViewClient(){

                    public boolean shouldOverideUrlLoading(WebView view, WebResourceRequest request){
                        view.loadUrl(request.getUrl().toString());
                        return false;
                    }
                });



            // servicio.setOnClickListener(this); https://autocarsdelpenedes.com/horaris
                // empresa.setOnClickListener(this); "http://www.multimediatarragona.com/
                // contacto.setOnClickListener(this);https://autocarsdelpenedes.com/horaris
            }
        });

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
                Uri telephone = Uri.parse("+34656265905");
                Intent firstTry = new Intent(Intent.ACTION_DIAL,telephone);
                startActivity(firstTry);

            }
        });

        //empresa.setOnClickListener(this);
       // contacto.setOnClickListener(this);


    }
}