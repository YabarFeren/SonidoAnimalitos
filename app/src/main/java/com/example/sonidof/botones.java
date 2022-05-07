package com.example.sonidof;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class botones extends AppCompatActivity {

    ImageButton btnGato,btnPerro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        btnGato=(ImageButton) findViewById(R.id.gato);
        btnPerro=(ImageButton) findViewById(R.id.perro);


        btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp=MediaPlayer.create(botones.this,R.raw.gato);
                mp.start();
            }
        });
        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp =MediaPlayer.create(botones.this,R.raw.perro);
                mp.start();
            }
        });
    }
    public void MensajeGatoto(View view){
        Toast.makeText(this,"Esto es un gatito",Toast.LENGTH_LONG).show();
    }
    public void MensajePerro(View view){
        Toast.makeText(this, "Esto es un perrito", Toast.LENGTH_SHORT).show();
    }
}