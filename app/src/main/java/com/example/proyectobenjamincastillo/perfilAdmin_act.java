package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perfilAdmin_act extends AppCompatActivity {

    private Button bGestionar, bSolicitudes, bIngresar, bActualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_admin);

        bGestionar = (Button) findViewById(R.id.bCitaciones);
        bSolicitudes = (Button) findViewById(R.id.bPromedio1);
        bIngresar = (Button) findViewById(R.id.bInfo1);
        bActualizar = (Button) findViewById(R.id.bCerrar1);
    }
    public void AbrirGestionar(View view){
        Intent i = new Intent(this, gestionar_act.class);
        startActivity(i);
    }
    public void AbrirSolicitudes(View view){
        Intent i = new Intent(this, solicitudes_act.class);
        startActivity(i);
    }
    public void AbrirIngresar(View view){
        Intent i = new Intent(this, ingresar_act.class);
        startActivity(i);
    }
    public void AbrirActualizar(View view){
        Intent i = new Intent(this, actualizar_act.class);
        startActivity(i);
    }
    public void VolverMain(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}