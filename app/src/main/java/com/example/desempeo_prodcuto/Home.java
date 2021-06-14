package com.example.desempeo_prodcuto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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

    //Metodo encargado de mostrar el menu
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        switch (id)
        {
            case(R.id.opcion1):

                Intent intent1=new Intent(Home.this,Datos_de_cundinamarca.class);
                startActivity(intent1);

                break;

            case(R.id.opcion2):

                Intent intent2=new Intent(Home.this,Economia.class);
                startActivity(intent2);
                break;
        }
        return  super.onOptionsItemSelected(item);
    }

    private void crear_listado()
    {
        lista_targetas.add(new Cartas("Zipaquirá",getString(R.string.Descripcion1),R.drawable.zipaquira));
        lista_targetas.add(new Cartas("Sancocho de gallina",getString(R.string.Descripcion2),R.drawable.sancocho_de_gallina));
        lista_targetas.add(new Cartas("Catedral de sal",getString(R.string.Descripcion3),R.drawable.catedral_sal));
    }
}