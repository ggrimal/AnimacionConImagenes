package com.example.brink.animacionconimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagen = (ImageView) findViewById(R.id.img);

        //Crear animacion de los items del archivo imagenes, que tiene que estar dentro de la carpeta drawable
        imagen.setBackgroundResource(R.drawable.imagenes);

    }
}
