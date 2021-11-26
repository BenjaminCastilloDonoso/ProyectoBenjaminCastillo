package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class verCitaciones_act extends AppCompatActivity {

    private CardView cardCitaciones;
    private Button bVolver10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_citaciones);

        cardCitaciones = (CardView) findViewById(R.id.cardCitaciones);
        bVolver10 = (Button) findViewById(R.id.bVolver10);
    }
    public void VolverCitaciones(View view){
        Intent i = new Intent(this, citaciones_act.class);
        startActivity(i);
    }
}