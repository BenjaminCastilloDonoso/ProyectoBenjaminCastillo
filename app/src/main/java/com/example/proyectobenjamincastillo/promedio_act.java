package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class promedio_act extends AppCompatActivity {

    private TextView lenguaje, matematica, ciencias, historia;
    private Button bVolver8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);

        lenguaje = (TextView) findViewById(R.id.lenguaje);
        matematica = (TextView) findViewById(R.id.matematica);
        ciencias = (TextView) findViewById(R.id.ciencias);
        historia = (TextView) findViewById(R.id.historia);
        bVolver8 = (Button) findViewById(R.id.bVolver8);
    }
    public void VolverA(View view){
        Intent i = new Intent(this, perfilAlumno_act.class);
        startActivity(i);
    }
}