package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ingresar_act extends AppCompatActivity {

    private TextView rutBuscar, notaLen, notaMat, notaCs, notaHis;
    private Button bBuscar1, bAct, bVolver3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        rutBuscar = (TextView) findViewById(R.id.rutBuscar);
        notaLen = (TextView) findViewById(R.id.notaLen);
        notaMat = (TextView) findViewById(R.id.notaMat);
        notaCs = (TextView) findViewById(R.id.notaCs);
        notaHis = (TextView) findViewById(R.id.notaHis);
        bBuscar1 = (Button) findViewById(R.id.bBuscar1);
        bAct = (Button) findViewById(R.id.bAct);
        bVolver3 = (Button) findViewById(R.id.bVolver3);
    }
    public void VolverAtras(View view){
        Intent i = new Intent(this, perfilAdmin_act.class);
        startActivity(i);
    }
}