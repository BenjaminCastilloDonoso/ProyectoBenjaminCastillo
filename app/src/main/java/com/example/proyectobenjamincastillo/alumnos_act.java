package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class alumnos_act extends AppCompatActivity {

    private EditText inputAlumno, inputClaveAlumno;
    private Button bIniciarAlumno, bVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnos);

        inputAlumno = (EditText) findViewById(R.id.inputAlumno);
        inputClaveAlumno = (EditText) findViewById(R.id.inputClaveAlumno);
        bIniciarAlumno = (Button) findViewById(R.id.bIniciarAlumno);
        bVolver = (Button) findViewById(R.id.bVolver);
    }
    public void IniciarAlumnos(View view){
        Intent i = new Intent(this, perfilAlumno_act.class);
        startActivity(i);
    }
    public void VolverABRIR(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}