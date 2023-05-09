package Guia10Colecciones.Servicios;

import Guia10Colecciones.Entidad.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
 * crear otra Pelicula o no.
 */
public class PeliculaService {
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void crearPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        while (continuar) {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula:");
            pelicula.setTitulo(leer.nextLine());
            System.out.println("Ingrese el director de la pelicula:");
            pelicula.setDirector(leer.nextLine());
            System.out.println("Ingrese la duracion de la pelicula:");
            pelicula.setDuracion(leer.nextFloat());
            leer.nextLine();
            peliculas.add(pelicula);
            System.out.println("Desea agregar otra pelicula? S/N");
            continuar = leer.nextLine().equalsIgnoreCase("s");
        }
        peliculas.add(new Pelicula("El Padrino", "Francis Ford Coppola", 2));
        peliculas.add(new Pelicula("Titanic", "James Cameron", 3));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 1));
    }

    public void mostrarTodasLasPeliculas() {
//        System.out.println("Todas las Peliculas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPelicusMasUnaHora() {
        System.out.println("Peliculas con duracion mayor a 1h:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    /**
     * Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
     * pantalla.
     */
    public void ordenarPeliculasDesc() {
        System.out.println("Peliculas de Mayor a Menor duracion:");
        /**
         * From google... :/
         * students.sort(Comparator.comparing(Student::getName)
         *                  .reversed()
         *                  .thenComparing(Student::getAge));
         */
        //Ordenar de mayor a menor duracion
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getDuracion);
        Collections.sort(peliculas, comp.reversed());
        mostrarTodasLasPeliculas();
    }

    /**
     * Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
     * pantalla.
     */
    public void ordenarPeliculasAsce() {
        System.out.println("Peliculas de Menor a Mayor duracion:");
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getDuracion);
        Collections.sort(peliculas, comp);
        mostrarTodasLasPeliculas();
    }

    /**
     * Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     */
    public void ordenarPeliculasTitulo() {
        System.out.println("Peliculas por titulo de la A a la Z:");
        /** From google... :/
         * students.sort(Comparator.comparing(Student::getName)
         *                 .thenComparing(Student::getAge));
         */
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getTitulo);
        Collections.sort(peliculas, comp);
        mostrarTodasLasPeliculas();
    }

    public void ordenarPeliculasDirector() {
        System.out.println("Peliculas por director de la A a la Z:");
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getDirector);
        Collections.sort(peliculas, comp);
        mostrarTodasLasPeliculas();
    }
}
