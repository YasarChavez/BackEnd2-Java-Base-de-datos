package Guia10Colecciones.Servicios;

import Guia10Colecciones.Entidad.Pelicula;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
 * crear otra Pelicula o no.
 */
public class PeliculaService {

    public void crearPelicula(ArrayList<Pelicula> peliculas){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        while (continuar){
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

    }
    public void mostrarTodasLasPeliculas(ArrayList<Pelicula> peliculas){
//        System.out.println("Todas las Peliculas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPelicusMasUnaHora(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas con duracion mayor a 1h:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }
    /**
     *Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
     * pantalla.
     */
    public void ordenarPeliculasDesc(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas de Mayor a Menor duracion:");
        /**
         * From google... :/
         * students.sort(Comparator.comparing(Student::getName)
         *                  .reversed()
         *                  .thenComparing(Student::getAge));
         */
        //Ordenar de mayor a menor duracion
        peliculas.sort(Comparator.comparing(Pelicula::getDuracion).reversed());
        mostrarTodasLasPeliculas(peliculas);
    }
    /**
     * Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
     * pantalla.
     */
    public void ordenarPeliculasAsce(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas de Menor a Mayor duracion:");
        peliculas.sort(Comparator.comparing(Pelicula::getDuracion));
        mostrarTodasLasPeliculas(peliculas);
    }
    /**
     * Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     */
    public void ordenarPeliculasTitulo(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas por titulo de la A a la Z:");
        /** From google... :/
         * students.sort(Comparator.comparing(Student::getName)
         *                 .thenComparing(Student::getAge));
         */
        peliculas.sort(Comparator.comparing(Pelicula::getTitulo));
        mostrarTodasLasPeliculas(peliculas);
    }
    public void ordenarPeliculasDirector(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas por director de la A a la Z:");
        peliculas.sort(Comparator.comparing(Pelicula::getDirector));
        mostrarTodasLasPeliculas(peliculas);
    }
}
