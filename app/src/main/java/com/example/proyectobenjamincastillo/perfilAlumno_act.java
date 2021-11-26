package com.example.proyectobenjamincastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class perfilAlumno_act extends AppCompatActivity {

    private VideoView videoView;
    private Button bClases, bCertificado, bPromedio, bInfo, bCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_alumno);

        videoView = (VideoView) findViewById(R.id.videoView);

        //Uri uri = Uri.parse("https://youtu.be/0VcAVfA4aco");
        //videoView.setMediaController((new MediaController(this)));
        //videoView.setVideoURI(uri);
        //videoView.requestFocus();
        //videoView.start();

        bClases = (Button) findViewById(R.id.bClases);
        bCertificado = (Button) findViewById(R.id.bCertificado);
        bPromedio = (Button) findViewById(R.id.bInfo);
        bCerrar = (Button) findViewById(R.id.bCerrar);
    }
    public void AbrirClases(View view){
        Intent i = new Intent(this, clases_Act.class);
        startActivity(i);
    }
    public void AbrirCertificado(View view){
        Intent i = new Intent(this, certificado_act.class);
        startActivity(i);
    }
    public void AbrirPromedio(View view){
        Intent i = new Intent(this, promedio_act.class);
        startActivity(i);
    }
    public void AbrirInformacion(View view){
        Intent i = new Intent(this, informacion_act.class);
        startActivity(i);
    }
    public void cerrar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}