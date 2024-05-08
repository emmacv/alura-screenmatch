package com.alura.screenmatch.calculos;

public class FiltroRecomendaciones {
    public void filtra(Clasificable clasdificacion) {
        if (clasdificacion.getClasification() >= 4) {
            System.out.println("Muy bien clasficada");
        } else if (clasdificacion.getClasification() >= 2) {
            System.out.println("Popular por el momento");
        } else {
            System.out.println("Agregala a tu lista de favoritos");
        }
    }
}
