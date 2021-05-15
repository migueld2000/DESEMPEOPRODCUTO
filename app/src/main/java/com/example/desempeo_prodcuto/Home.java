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
        lista_targetas.add(new Cartas("Zipaquirá","Zipaquirá es un municipio de Colombia ubicado en el " +
                "departamento de Cundinamarca, en la provincia de Sabana Centro, de la que es la capital y sede de su diócesis." +
                " Se encuentra a 29 km de Bogotá, de la cual hace parte de su área metropolitana, Con una población de 126 4094" +
                " habitantes, es el segundo municipio más grande y poblado de la provincia. Es uno de los centros de explotación" +
                " de sal más importantes en Colombia, razón por la cual también es conocida como la Capital Salinera de Colombia " +
                "por su producción de sal.",R.drawable.Zipaquirá));
        lista_targetas.add(new Cartas("Sancocho de gallina","Una sopa preparada con pollo, papa y plátano," +
                "y papas en salmuera, que son papas conservadas en agua con sal y azúcar.",R.drawable.sancocho_de_gallina));
        lista_targetas.add(new Cartas("Catedral de sal","Nombrada Primera Maravilla de Colombia en 2007. " +
                "La catedral está construida en una mina subterránea de sal y tiene varias esculturas hechas con este mineral. " +
                "Se pueden tomar tours guíados por la catedral, ver un video 3D para aprender sobre la mina, comprar souvenirs e " +
                "incluso comer algunos aperitivos bajo tierra. Existe también el tour la Ruta del Minero, el cual te permite " +
                "experimentar el trabajo de los mineros reales. ",R.drawable.catedral_sal));
    }
}