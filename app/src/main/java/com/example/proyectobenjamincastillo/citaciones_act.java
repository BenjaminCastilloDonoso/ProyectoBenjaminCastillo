package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class citaciones_act extends AppCompatActivity {

    private TextView trut, tObservaciones;
    private Spinner spDia, spMes1;
    private Button bGuardar, bVer, bVolver9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citaciones);

        trut = (TextView) findViewById(R.id.trut);
        tObservaciones = (TextView) findViewById(R.id.tObservaciones);
        spDia = (Spinner) findViewById(R.id.spDia);
        spMes1 = (Spinner) findViewById(R.id.spMes1);
        bGuardar = (Button) findViewById(R.id.bGuardar);
        bVer = (Button) findViewById(R.id.bVer);
        bVolver9 = (Button) findViewById(R.id.bVolver9);
    }
    public void AbrirCitaciones (View view){
        Intent i = new Intent(this, verCitaciones_act.class);
        startActivity(i);
    }
    public void VolverAInicio(View view){
        Intent i = new Intent(this, perfilProfesores_act.class);
        startActivity(i);
    }
}