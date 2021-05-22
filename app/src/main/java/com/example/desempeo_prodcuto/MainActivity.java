package com.example.desempeo_prodcuto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Cartas carta;
    TextView nombre,informacion;
    ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carta=(Cartas)getIntent().getSerializableExtra("datosTargeta");
        foto=findViewById(R.id.foto);
        nombre=findViewById(R.id.nombre);
        informacion=findViewById(R.id.informacion);

        foto.setImageResource(carta.getFotoCarta());
        nombre.setText(carta.getNombre());
        informacion.setText(carta.getInformacionCarta());
    }
}