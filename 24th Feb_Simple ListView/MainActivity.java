package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    Button getElement;
    ListView lista;
    EditText editarTexto;
    List<String> miLista = new ArrayList<>();
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getElement =(Button) findViewById(R.id.Btn1);
        lista = (ListView) findViewById(R.id.lista);
        editarTexto = (EditText) findViewById(R.id.usuario);

        getElement.setOnClickListener(this);
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.Btn1: String texto = editarTexto.getText().toString();
            miLista.add(texto);
            editarTexto.getText().clear();
            adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, miLista);
            lista.setAdapter(adaptador);
        }

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Toast.makeText(this, "Item clicked:" + position, Toast.LENGTH_SHORT).show();

    }
}