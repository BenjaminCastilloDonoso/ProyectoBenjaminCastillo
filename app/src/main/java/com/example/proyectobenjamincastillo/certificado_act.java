package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import objetos.objetos;

public class certificado_act extends AppCompatActivity {

    private TextView txtCurso, txtRut;
    private Spinner spMotivos;
    private Button bSolicitar, bVolver6;

    objetos obj = new objetos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificado);

        txtCurso = (TextView) findViewById(R.id.txtCurso);
        txtRut = (TextView) findViewById(R.id.txtRut);
        spMotivos = (Spinner) findViewById(R.id.spMotivos);
        bSolicitar = (Button) findViewById(R.id.bSolicitar);
        bVolver6 = (Button) findViewById(R.id.bVolver6);

        ArrayAdapter adaptMotivos = new ArrayAdapter(this, android.R.layout.simple_list_item_1, obj.getMotivo());
        spMotivos.setAdapter(adaptMotivos);
    }
    public void VolverPerfil(View view){
        Intent i = new Intent(this, perfilAlumno_act.class);
        startActivity(i);
    }
}