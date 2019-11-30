package com.example.repositorio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Boton = findViewById(R.id.btMensaje);
        Boton.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                Toast.makeText(MainActivity.this,"Prueba", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
