package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class actualizar_act extends AppCompatActivity {

    private TextView edtel1, edtel2, edco, eddi, edra, edrut;
    private Button bActualizar2, bVolver4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar);

        edtel1 = (TextView) findViewById(R.id.edtel1);
        edtel2 = (TextView) findViewById(R.id.edtel2);
        edco = (TextView) findViewById(R.id.edco);
        eddi = (TextView) findViewById(R.id.eddi);
        edra = (TextView) findViewById(R.id.edra);
        bActualizar2 = (Button) findViewById(R.id.bActualizar2);
        bVolver4 = (Button) findViewById(R.id.bVolver4);
    }
    public void VolverVolver (View view){
        Intent i = new Intent(this, perfilAdmin_act.class);
        startActivity(i);
    }
}