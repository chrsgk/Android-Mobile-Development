package com.example.autocarsdelpenedes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Contacto extends AppCompatActivity {

    EditText enviarMsg;
    Button llamar;
    Button enviar;
    Button inicio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        llamar = findViewById(R.id.Btn7);
        enviar = findViewById(R.id.Btn8);
        inicio = findViewById(R.id.Btn9);

        llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri telephone = Uri.parse("tel:+34656265905");
                Intent firstTry = new Intent(Intent.ACTION_DIAL, telephone);
                startActivity(firstTry);
            }
        });

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri msg = Uri.parse("smsto:+34656265905");
                Intent firstTry = new Intent(Intent.ACTION_SENDTO,msg);

                startActivity(firstTry);

            }
        });

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToDoSomething = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentToDoSomething);
            }
        });

    }
}