package com.example.autocarsdelpenedes;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Menu extends Fragment {

    Button horarios;
    Button servicios;
    Button empresa;
    Button contacto;
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.menu, container, false);

        horarios = (Button) rootView.findViewById(R.id.Btn10);
        servicios = (Button) rootView.findViewById(R.id.Btn11);
        empresa = (Button) rootView.findViewById(R.id.Btn12);
        contacto = (Button) rootView.findViewById(R.id.Btn13);

        horarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToDoSomething = new Intent(getActivity(),MainActivity.class);
                startActivity(intentToDoSomething);
            }
        });

        servicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToDoSomething = new Intent(getActivity(),Servicios.class);
                startActivity(intentToDoSomething);
            }
        });

        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToDoSomething = new Intent(getActivity(), Empresa.class);
                startActivity(intentToDoSomething);
            }
        });

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intientToDoSomething = new Intent(getActivity(),Contacto.class);
                startActivity(intientToDoSomething);

            }
        });
        return rootView;

    }



}
