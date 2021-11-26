package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class informacion_act extends AppCompatActivity {

    private TextView nombre, rut, tel1, tel2, direccion, correo;
    private Button bVolver7;
    private ImageButton bDireccion, bTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        nombre = (TextView) findViewById(R.id.nombre);
        rut = (TextView) findViewById(R.id.rut);
        tel1 = (TextView) findViewById(R.id.tel1);
        tel2 = (TextView) findViewById(R.id.tel2);
        direccion = (TextView) findViewById(R.id.direccion);
        correo = (TextView) findViewById(R.id.correo);
        bVolver7 = (Button) findViewById(R.id.bVolver7);
        bDireccion = (ImageButton) findViewById(R.id.bDireccion);
        bTelefono = (ImageButton) findViewById(R.id.bTelefono);
    }
    public void volveratras(View view){
        Intent i = new Intent(this, perfilAlumno_act.class);
        startActivity(i);
    }
}