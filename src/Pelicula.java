public class Pelicula  extends  Titulo implements Clasificacion {
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
}

