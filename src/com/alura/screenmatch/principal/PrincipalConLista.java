package com.alura.screenmatch.principal;

import com.alura.screenmatch.models.Pelicula;
import com.alura.screenmatch.models.Serie;
import com.alura.screenmatch.models.Titulo;

import java.util.*;

public class PrincipalConLista {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        Serie casaDragon = new Serie("La casa del dragón", 2022);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);

        List<Titulo> listaTitulos = new LinkedList<>();

        listaTitulos.add(miPelicula);
        listaTitulos.add(otraPelicula);
        listaTitulos.add(casaDragon);

        for (Titulo item : listaTitulos ) {
            if (item instanceof Pelicula pelicula) {
                System.out.println(pelicula.getClasification());
            }
        }

        ArrayList<String> artistas = new ArrayList<>();

        artistas.add("Penelope cruz");
        artistas.add("Antonio banderas");
        artistas.add("Ricardo Darin");

        ArrayList artistas1 = (ArrayList<String>)artistas.clone();

        Collections.sort(listaTitulos);

        System.out.println(listaTitulos);
        var comparator = Comparator.comparing(Titulo::getFechaDeLanzamiento);

        listaTitulos.sort(comparator);
    }
}
