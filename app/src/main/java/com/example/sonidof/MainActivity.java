package com.example.sonidof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button audio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio=findViewById((R.id.reproducir));
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudio();
            }
        });
    }
    private void LlamarAudio(){
        Intent intent=new Intent(MainActivity.this,botones.class);
        startActivity(intent);
    }
}