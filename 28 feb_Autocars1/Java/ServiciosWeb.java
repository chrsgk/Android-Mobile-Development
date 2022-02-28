package com.example.autocarsdelpenedes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ServiciosWeb extends AppCompatActivity {
    private WebView website;
    Button regresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_web);

        website = findViewById(R.id.Services);
        regresar = findViewById(R.id.Btn10);

        website.loadUrl("https://www.catalunya.com/autocars-del-penedes-16-12004-13?language=es");
        website.setWebViewClient(new WebViewClient());
        WebSettings webSettings = website.getSettings();
        webSettings.setJavaScriptEnabled(true);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToDoSomething = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentToDoSomething);
            }
        });
    }

    @Override
    public void onBackPressed() {

        if(website.canGoBack()){
            website.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
