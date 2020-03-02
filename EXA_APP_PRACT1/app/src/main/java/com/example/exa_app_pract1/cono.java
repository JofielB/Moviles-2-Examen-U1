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
public class cono extends Fragment {


    public cono() {
        // Required empty public constructor
    }

    EditText editTextBase, editTextAltura;
    TextView textViewArea;
    int base, altura;
    double resultado;
    Button resul;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.cono,
                container, false);

        // Inflate the layout for this fragment
        editTextBase = view.findViewById(R.id.base);
        editTextAltura = view.findViewById(R.id.altura);
        textViewArea = view.findViewById(R.id.textView2);

        resul = view.findViewById(R.id.button);

        resul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                base = Integer.parseInt(editTextBase.getText().toString());
                altura = Integer.parseInt(editTextAltura.getText().toString());

                resultado = 3.1416 * (base * altura);
                textViewArea.setText(resultado + " m^2");

            }
        });


        return view;


    }


}
