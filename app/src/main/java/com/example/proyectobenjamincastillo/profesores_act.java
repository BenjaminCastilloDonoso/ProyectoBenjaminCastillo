package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class profesores_act extends AppCompatActivity {

    private EditText inputProfesor, inputClaveProfesor;
    private Button bIniciarProfesor, bVolver1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesores);

        inputProfesor = (EditText) findViewById(R.id.inputProfesor);
        inputClaveProfesor = (EditText) findViewById(R.id.inputClaveProfesor);
        bIniciarProfesor = (Button) findViewById(R.id.bIniciarProfesor);
        bVolver1 = (Button) findViewById(R.id.bVolver1);
    }
    public void IniciarProfesores (View view){
        Intent i = new Intent(this, perfilProfesores_act.class);
        startActivity(i);
    }
    public void VolverInicio (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}