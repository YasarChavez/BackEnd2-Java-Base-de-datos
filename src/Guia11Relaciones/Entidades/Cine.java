package Guia11Relaciones.Entidades;

/**
 *
 * De Cine nos interesa conocer la película que se está reproduciendo, la
 * sala con los espectadores y el precio de la entrada.
 */
public class Cine {
    private Pelicula pelicula;
    private  SalaCine sala;
    private double precio;


    public Cine(Pelicula pelicula, SalaCine sala, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "pelicula=" + pelicula +
                ", sala=" + sala +
                ", precio=" + precio +
                '}';
    }
}
