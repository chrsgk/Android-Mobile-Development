package com.example.autocarsdelpenedes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Empresa extends AppCompatActivity {

    Button Inicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);

        Inicio = findViewById(R.id.Btn6);

        Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToDoSomething = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentToDoSomething);
            }
        });

    }
}