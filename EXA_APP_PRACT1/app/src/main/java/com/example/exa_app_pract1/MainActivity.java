package com.example.exa_app_pract1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.Editable;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                switch (i) {
                    case R.id.radioCuadrado:
//                        Toast.makeText(getApplicationContext(), "Cuadrado", Toast.LENGTH_SHORT).show();
                        FormulasFragment formulasFragment = new FormulasFragment();
                        ft.replace(R.id.container, formulasFragment);
                        ft.commit();
                        break;
                    case R.id.radioRectangulo:
//                       Toast.makeText(getApplicationContext(), "Rectangulo", Toast.LENGTH_SHORT).show();
                        rectangulo rectangulo = new rectangulo();
                        ft.replace(R.id.container, rectangulo);
                        ft.commit();
                        break;
                    case R.id.radioTapesio:
//                     Toast.makeText(getApplicationContext(), "Trapecio", Toast.LENGTH_SHORT).show();
                        trapecio trapecio = new trapecio();
                        ft.replace(R.id.container, trapecio);
                        ft.commit();
                        break;
                    case R.id.radioTriangulo:
//                        Toast.makeText(getApplicationContext(), "Triangulo", Toast.LENGTH_SHORT).show();
                        triangulo triangulo = new triangulo();
                        ft.replace(R.id.container, triangulo);
                        ft.commit();
                        break;
                    case R.id.radioCirculo:
//                        Toast.makeText(getApplicationContext(), "Circulo", Toast.LENGTH_SHORT).show();
                        circulo circulo = new circulo();
                        ft.replace(R.id.container, circulo);
                        ft.commit();
                        break;
                    case R.id.radioRombo:
//                        Toast.makeText(getApplicationContext(), "Rombo", Toast.LENGTH_SHORT).show();
                        rombo rombo = new rombo();
                        ft.replace(R.id.container, rombo);
                        ft.commit();
                        break;
                    case R.id.radioEsfera:
//                        Toast.makeText(getApplicationContext(), "Esfera", Toast.LENGTH_SHORT).show();
                        esfera esfera = new esfera();
                        ft.replace(R.id.container, esfera);
                        ft.commit();
                        break;
                    case R.id.radioCilindro:
//                        Toast.makeText(getApplicationContext(), "Cilindro", Toast.LENGTH_SHORT).show();
                        cilindro cilindro = new cilindro();
                        ft.replace(R.id.container, cilindro);
                        ft.commit();
                        break;
                    case R.id.radioCubo:
//                        Toast.makeText(getApplicationContext(), "Cubo", Toast.LENGTH_SHORT).show();
                        cubo cubo = new cubo();
                        ft.replace(R.id.container, cubo);
                        ft.commit();
                        break;
                    case R.id.radioCono:
//                        Toast.makeText(getApplicationContext(), "Cubo", Toast.LENGTH_SHORT).show();
                        cono cono = new cono();
                        ft.replace(R.id.container, cono);
                        ft.commit();
                        break;

                }

            }
        });

    }
}
