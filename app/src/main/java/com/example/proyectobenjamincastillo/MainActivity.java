package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputUsuario, inputClave;
    private Button bIniciar, bAlumnos, bSalir;
    private ImageButton bInstagram, bYoutube, bPagina;
    private final static String instaURL = "http://www.colegioloscarrera.cl";
    private final static String youURL = "http:www.youtube.com/";
    private final static String pagURL = "http://www.colegioloscarrera.cl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUsuario = (EditText) findViewById(R.id.inputProfesor);
        inputClave = (EditText) findViewById(R.id.inputClaveProfesor);
        bIniciar = (Button) findViewById(R.id.bIniciarProfesor);
        bAlumnos = (Button) findViewById(R.id.bVolver1);
        bSalir = (Button) findViewById(R.id.bSalir);
        bInstagram = (ImageButton) findViewById(R.id.bInstagram);
        bYoutube = (ImageButton) findViewById(R.id.bYoutube);
        bPagina = (ImageButton) findViewById(R.id.bPagina);

        bInstagram.setOnClickListener(this);
        bYoutube.setOnClickListener(this);
        bPagina.setOnClickListener(this);
    }


    public void AbrirPerfilAdmin(View view){
        if(inputUsuario.equals("Benjamin")&&inputClave.equals("1234")){
            Intent i = new Intent(this, perfilAdmin_act.class);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrectos",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, perfilAdmin_act.class);
            startActivity(i);
        }

    }
    /*public void AbrirInputProfesores(View view){
        Intent i = new Intent(this, profesores_act.class);
        startActivity(i);
    }*/
    public void AbrirInputAlumnos (View view){
        Intent i = new Intent(this, alumnos_act.class);
        startActivity(i);
    }
    public void salir (View view){
        finish();
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent((Intent.ACTION_VIEW));
        switch(v.getId()){
            case R.id.bInstagram:
                intent.setData(Uri.parse(instaURL));
                startActivity(intent);
                break;
            case R.id.bYoutube:
                intent.setData(Uri.parse(youURL));
                startActivity(intent);
                break;
            case R.id.bPagina:
                intent.setData(Uri.parse(pagURL));
                startActivity(intent);
                break;
        }
    }
}