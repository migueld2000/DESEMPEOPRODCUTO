package com.example.desempeo_prodcuto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.viewHolder> {
    ArrayList<Cartas>listado;

    public ListaAdaptador(ArrayList<Cartas> listado) {
        this.listado = listado;
    }

    @NonNull
    @Override
    public ListaAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistadelItemlista= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_lista,parent,false);
        return new viewHolder(vistadelItemlista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaAdaptador.viewHolder holder, int position) {
        holder.actualizarDatos(listado.get(position));
    }

    @Override
    public int getItemCount() {
        return listado.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
        TextView nombre;
        TextView informacion;
        ImageView foto;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.nombre);
            informacion=itemView.findViewById(R.id.informacion);
            foto=itemView.findViewById(R.id.foto);
        }

        public void actualizarDatos(Cartas cartas) {
            nombre.setText(cartas.getNombre());
            informacion.setText(cartas.getInformacionCarta());
            foto.setImageResource(cartas.getFotoCarta());

        }
    }
}
