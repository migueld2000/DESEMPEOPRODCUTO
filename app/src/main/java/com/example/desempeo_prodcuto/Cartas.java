package com.example.desempeo_prodcuto;

import java.io.Serializable;

public class Cartas implements Serializable {
    String nombre;
    String informacionCarta;
    int fotoCarta;

    public Cartas(String nombre, String informacionCarta, int fotoCarta) {
        this.nombre = nombre;
        this.informacionCarta = informacionCarta;
        this.fotoCarta = fotoCarta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInformacionCarta() {
        return informacionCarta;
    }

    public void setInformacionCarta(String informacionCarta) {
        this.informacionCarta = informacionCarta;
    }

    public int getFotoCarta() {
        return fotoCarta;
    }

    public void setFotoCarta(int fotoCarta) {
        this.fotoCarta = fotoCarta;
    }
}
