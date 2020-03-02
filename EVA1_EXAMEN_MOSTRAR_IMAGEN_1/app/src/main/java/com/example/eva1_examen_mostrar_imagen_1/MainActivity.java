package com.example.eva1_examen_mostrar_imagen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    SeekBar skCambio;

    int escenas[] = {
            R.layout.escena_uno,
            R.layout.escena_dos,
            R.layout.escena_tres,
            R.layout.escena_cuatro,
            R.layout.escena_cinco,
            R.layout.escena_seis,
            R.layout.escena_siete,
            R.layout.escena_ocho,
            R.layout.escena_vacia
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.layEsc) == null){ //LandScape
            final ViewGroup izq = findViewById(R.id.lnIzq);
            final ViewGroup cen = findViewById(R.id.lnCen);
            final ViewGroup der = findViewById(R.id.lnDer);

            Transition fade = new Fade();

            TransitionManager.go(remplzarEscena(izq,escenas[8]),fade);
            TransitionManager.go(remplzarEscena(cen,escenas[0]),fade);
            TransitionManager.go(remplzarEscena(der,escenas[1]),fade);

            skCambio = findViewById(R.id.seekBarLand);
            skCambio.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    Transition fade = new Fade();
                    if(i-1 < 0){
                        TransitionManager.go(remplzarEscena(izq,escenas[8]),fade);
                    }else{
                        TransitionManager.go(remplzarEscena(izq,escenas[i-1]),fade);
                    }

                    TransitionManager.go(remplzarEscena(cen,escenas[i]),fade);

                    if(i+1 > escenas.length){
                        TransitionManager.go(remplzarEscena(der,escenas[8]),fade);
                    }else{
                        TransitionManager.go(remplzarEscena(der,escenas[i+1]),fade);
                    }

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

        }else { // Portrait
            final ViewGroup remplazar = findViewById(R.id.layEsc);

            Transition fade = new Fade();
            TransitionManager.go(remplzarEscena(remplazar,escenas[0]),fade);


            skCambio = findViewById(R.id.seekBar);
            skCambio.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    Transition fade = new Fade();
                    TransitionManager.go(remplzarEscena(remplazar,escenas[i]),fade);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }


    }

    public Scene remplzarEscena(ViewGroup viewGroup, int layout){
        Scene escena = Scene.getSceneForLayout(viewGroup,layout,this);
        return escena;
    }

}
