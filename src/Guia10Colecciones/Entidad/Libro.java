package Guia10Colecciones.Entidad;

/**
 * Implemente un programa para una Librería haciendo uso de un HashSet para evitar
 * datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
 * información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
 * el título del libro, autor, número de ejemplares y número de ejemplares prestados.
 * También se creará en el main un HashSet de tipo Libro que guardará todos los libros
 * creados.
 * En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
 * sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
 * se le pregunta al usuario si quiere crear otro Libro o no.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numeroDeEjemplares;
    private int NumeroDeEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroDeEjemplares, int getNumeroDeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.NumeroDeEjemplaresPrestados = getNumeroDeEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public int getNumeroDeEjemplaresPrestados() {
        return NumeroDeEjemplaresPrestados;
    }

    public void setNumeroDeEjemplaresPrestados(int numeroDeEjemplaresPrestados) {
        NumeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDeEjemplares=" + numeroDeEjemplares +
                ", getNumeroDeEjemplaresPrestados=" + NumeroDeEjemplaresPrestados +
                '}';
    }
}
