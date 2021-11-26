package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class solicitudes_act extends AppCompatActivity {

    private Button bVolver2;
    private CardView listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitudes);

        bVolver2 = (Button) findViewById(R.id.bVolver2);
        listado = (CardView) findViewById(R.id.listado);
    }
    public void Volver2(View view){
        Intent i = new Intent(this, perfilAdmin_act.class);
        startActivity(i);
    }
}