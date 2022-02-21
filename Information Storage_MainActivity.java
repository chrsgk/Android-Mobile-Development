package com.example.perdida_informacion;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<TAG> extends AppCompatActivity {

    static final String TAG = "DATO";
    TextView texto;
    EditText editarTexto;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here the utility log.d will print the message "on create" to understand exactly
        // where Iam, where the code runs.

        Log.d(TAG,"Hemos ejecutado el metodo oncreate");
        texto =(TextView) findViewById(R.id.textview);
        editarTexto =(EditText) findViewById(R.id.editarTexto);
        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto.setText(editarTexto.getText().toString());
            }
        });
        // Here we are building two methods to manage our information/data in order to save it.
        // onSaveInstanceState -> almacenar e estado de la activity y algunos datos (pero TENEMOS QUE
        //DATOS QUEREMOS ALMACENAR



        }

    protected void onStart() {

        super.onStart();
        Log.d(TAG, "Hemos ejecutdo el metódo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Hemos ejecutado el metódo onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Hemos ejecutado el metódo onPause");
    }

    public void onSaveInstance(Bundle outState) {
        outState.putString("guardado", texto.getText().toString());
        outState.putInt("my int", 18);
        outState.putBoolean("trabajo", true);
        super.onSaveInstanceState(outState);
        Log.d(TAG, "Hemos grabado el String por SAVE");

    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }
}