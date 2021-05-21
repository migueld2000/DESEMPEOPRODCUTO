package com.example.desempeo_prodcuto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity
{
    ArrayList<Cartas> lista_targetas=new ArrayList<>();
    RecyclerView listado_grafico;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listado_grafico=findViewById(R.id.lista);
        listado_grafico.setHasFixedSize(true);
        listado_grafico.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crear_listado();
        ListaAdaptador adaptador=new ListaAdaptador(lista_targetas);
        listado_grafico.setAdapter(adaptador);
    }
    private void crear_listado()
    {
        lista_targetas.add(new Cartas("Zipaquirá",getString(R.string.Descripcion1),R.drawable.zipaquira));
        lista_targetas.add(new Cartas("Sancocho de gallina",getString(R.string.Descripcion2),R.drawable.sancocho_de_gallina));
        lista_targetas.add(new Cartas("Catedral de sal",getString(R.string.Descripcion3),R.drawable.catedral_sal));
    }
}