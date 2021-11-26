package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import objetos.objetos;

public class clases_Act extends AppCompatActivity {

    private Spinner spCurso, spMes;
    private Button bRedirigir, bVolver5;

    objetos obj = new objetos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clases);

        spCurso = (Spinner) findViewById(R.id.spCurso);
        spMes = (Spinner) findViewById(R.id.spMes);
        bRedirigir = (Button) findViewById(R.id.bRedirigir);
        bVolver5 = (Button) findViewById(R.id.bVolver5);

        ArrayAdapter adaptCurso = new ArrayAdapter(this, android.R.layout.simple_list_item_1, obj.getCurso());
        spCurso.setAdapter(adaptCurso);
        ArrayAdapter adaptMes = new ArrayAdapter(this, android.R.layout.simple_list_item_1, obj.getMes());
        spMes.setAdapter(adaptMes);
    }
    public void VolverDenuevo(View view){
        Intent i = new Intent(this, perfilAlumno_act.class);
        startActivity(i);
    }


}