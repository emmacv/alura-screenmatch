package com.alura.screenmatch.principal;

import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendaciones;
import com.alura.screenmatch.models.Episodio;
import com.alura.screenmatch.models.Pelicula;
import com.alura.screenmatch.models.Serie;

import java.util.ArrayList;
import java.util.Collection;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragón", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaciones "
                + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendaciones filtroDeRecomendacion = new FiltroRecomendaciones();
        filtroDeRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setNombre("La casa de Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(360);

        filtroDeRecomendacion.filtra(episodio);

        var nuevaPelicula = new Pelicula("El señor de los anillos", 2001);
        nuevaPelicula.setDuracionEnMinutos(180);

        ArrayList<Pelicula> myArrayList = new ArrayList<>();

        myArrayList.add(nuevaPelicula);
        myArrayList.add(nuevaPelicula);
        System.out.println(myArrayList.get(0));
    }
}