package com.example.exa_app_pract1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Fragment fragment;
    EditText editText, editText1, editText2;
    float formula;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        textView2 = findViewById(R.id.textView2);

        fragment = new Fragment();
        //getSupportFragmentManager().beginTransaction().add(R.id.container, fragment);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioCirculo:
                        Toast.makeText(getApplicationContext(), "Circulo", Toast.LENGTH_SHORT).show();
                        editText.setVisibility(View.VISIBLE);
                        editText.setHint("Radio del circulo");
                        editText1.setVisibility(View.INVISIBLE);
                        editText2.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radioRectangulo:
                        Toast.makeText(getApplicationContext(), "Rectangulo", Toast.LENGTH_SHORT).show();
                        editText.setHint("Base del rectangulo");
                        editText1.setVisibility(View.VISIBLE);
                        editText1.setHint("Altura del rectangulo");
                        editText2.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radioTriangulo:
                        Toast.makeText(getApplicationContext(), "Triangulo", Toast.LENGTH_SHORT).show();
                        editText.setHint("Base del triangulo");
                        editText1.setHint("Altura del triangulo");
                        editText1.setVisibility(View.VISIBLE);
                        editText2.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radioCuadrado:
                        Toast.makeText(getApplicationContext(), "Cuadrado", Toast.LENGTH_SHORT).show();
                        editText.setHint("Lado del cuadrado");
                        editText1.setVisibility(View.INVISIBLE);
                        editText2.setVisibility(View.INVISIBLE);
                        break;
                }

            }
        });

    }

    public void calcularFomula(View view) {
        int i = radioGroup.getCheckedRadioButtonId();
        float valor1 = Float.parseFloat(editText.getText().toString());
        float valor2 = Float.parseFloat(editText1.getText().toString());
//        float valor3 = Float.parseFloat(editText2.getText().toString());
        switch (i){
            case R.id.radioCuadrado:
                Toast.makeText(getApplicationContext(), "Cuadrado", Toast.LENGTH_SHORT).show();
                formula = (valor1 * valor1); //Base * altura
                textView2.setText("" + formula);
                break;
            case R.id.radioRectangulo:
                Toast.makeText(getApplicationContext(), "Rectangulo", Toast.LENGTH_SHORT).show();
                formula = (valor1 * valor2); //Base * altura
                textView2.setText("" + formula);
                break;
            case R.id.radioCirculo:
                Toast.makeText(getApplicationContext(), "Circulo", Toast.LENGTH_SHORT).show();
                float radio = valor1; //Asignamos el valor1 al radio
                formula = (float) (3.1416  * valor1);
                textView2.setText("" + formula);
                break;
            case R.id.radioTriangulo:
                Toast.makeText(getApplicationContext(), "Triangulo", Toast.LENGTH_SHORT).show();
                formula = (valor1 * valor2)/ 2 ; //Base * altura / 2
                textView2.setText("" + formula);
                break;
        }
    }
}
