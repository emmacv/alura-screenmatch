package com.alura.screenmatch.models;

import com.alura.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void method() {
        super.method();
    }

    @Override
    public int getClasification() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + getNombre() + "(" + getFechaDeLanzamiento() + ")";
    }
}

