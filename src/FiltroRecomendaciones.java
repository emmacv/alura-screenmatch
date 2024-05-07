public class FiltroRecomendaciones {
    public void filtra(Clasificacion clasdificacion) {
        if (clasdificacion.getClasification() >= 4) {
            System.out.println("Muy bien clasficada");
        } else if (clasdificacion.getClasification() >= 2) {
            System.out.println("Popular por el momento");
        } else {
            System.out.println("Agregala a tu lista de favoritos");
        }
    }
}
