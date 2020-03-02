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
public class trapecio extends Fragment {


    public trapecio() {
        // Required empty public constructor
    }

    EditText editTextBase, editTextBase2, editTextAltura;
    TextView textViewArea;
    int base, base2, altura;
    int resultado;
    Button resul;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.trapesio,
                container, false);

        // Inflate the layout for this fragment
        editTextBase = view.findViewById(R.id.base);
        editTextBase2 = view.findViewById(R.id.base1);
        editTextAltura = view.findViewById(R.id.altura);
        textViewArea = view.findViewById(R.id.textView2);

        resul = view.findViewById(R.id.button);

        resul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                base = Integer.parseInt(editTextBase.getText().toString());
                base2 = Integer.parseInt(editTextBase2.getText().toString());
                altura = Integer.parseInt(editTextAltura.getText().toString());

                resultado = ((base + base2) * altura) / 2;
                textViewArea.setText(resultado + " m^2");

            }
        });

        return view;

    }


}
