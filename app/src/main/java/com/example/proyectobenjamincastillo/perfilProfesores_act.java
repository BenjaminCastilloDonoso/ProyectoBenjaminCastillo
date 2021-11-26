package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perfilProfesores_act extends AppCompatActivity {

    private Button bCitaciones, bPromedio1, bInfo1, bCerrar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_profesores);

        bCitaciones = (Button) findViewById(R.id.bCitaciones);
        bPromedio1 = (Button) findViewById(R.id.bPromedio1);
        bInfo1 = (Button) findViewById(R.id.bInfo1);
        bCerrar1 = (Button) findViewById(R.id.bCerrar1);
    }
    public void AbrirCitaciones(View view){
        Intent i = new Intent(this, citaciones_act.class);
        startActivity(i);
    }

    public void VolverInicio(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}