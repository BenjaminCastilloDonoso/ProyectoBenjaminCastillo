package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gestionar_act extends AppCompatActivity {
    private Button bBuscar, bListo;
    private TextView tCurso, apePaterno, apeMaterno, pNombre, sNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestionar);

        bBuscar = (Button) findViewById(R.id.bBuscar);
        bListo = (Button) findViewById(R.id.bListo);
        tCurso = (TextView) findViewById(R.id.tCurso);
        apePaterno = (TextView) findViewById(R.id.apePaterno);
        apeMaterno = (TextView) findViewById(R.id.apeMaterno);
        pNombre = (TextView) findViewById(R.id.pNombre);
        sNombre = (TextView) findViewById(R.id.sNombre);


    }
    public void Volver(View view){
        Intent i = new Intent(this, perfilAdmin_act.class);
        startActivity(i);
    }
}