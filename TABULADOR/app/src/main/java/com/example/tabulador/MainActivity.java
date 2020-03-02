package com.example.tabulador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_falcon(View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        falcon one = new falcon();
        ft.replace(R.id.frm_layout, one);
        ft.commit();
    }

    public void click_ares(View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ares_v one = new ares_v();
        ft.replace(R.id.frm_layout, one);
        ft.commit();
    }

    public void click_shuttle(View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        shuttle one = new shuttle();
        ft.replace(R.id.frm_layout, one);
        ft.commit();
    }


}
