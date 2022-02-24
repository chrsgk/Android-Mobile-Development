package com.example.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.fragments.R;

public class Derecha extends Fragment {
    TextView text;
    View rootView;

    public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        rootView = inflater.inflate(R.layout.derecha, container, false);

        text = (TextView) rootView.findViewById(R.id.text);
        return rootView;
    }
    public void ObtenerDatos(String mensaje){ text.setText(mensaje);

    }
}
