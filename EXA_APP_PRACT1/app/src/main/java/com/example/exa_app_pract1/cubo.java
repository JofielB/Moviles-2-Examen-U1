package com.example.exa_app_pract1;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class cubo extends Fragment {


    public cubo() {
        // Required empty public constructor
    }

    EditText editTextLado;
    TextView textViewArea;
    int lado;
    int resultado;
    Button resul;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.cubo,
                container, false);

        // Inflate the layout for this fragment
        editTextLado = view.findViewById(R.id.lado);
        textViewArea = view.findViewById(R.id.textView2);

        resul = view.findViewById(R.id.button);

        resul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lado = Integer.parseInt(editTextLado.getText().toString());
                resultado = 6 * (lado * lado);
                textViewArea.setText(resultado + " m^2");

            }
        });

        return view;

    }
}
