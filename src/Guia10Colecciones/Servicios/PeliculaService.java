package Guia10Colecciones.Servicios;

import Guia10Colecciones.Entidad.Pelicula;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

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
            System.out.println("Ingrese el titulo de la pelicula");
            pelicula.setTitulo(leer.nextLine());
            System.out.println("Ingrese el director de la pelicula");
            pelicula.setDirector(leer.nextLine());
            System.out.println("Ingrese la duracion de la pelicula");
            pelicula.setDuracion(leer.nextFloat());
            leer.nextLine();
            peliculas.add(pelicula);
            System.out.println("Desea agregar otra pelicula? S/N");
            continuar = leer.nextLine().equalsIgnoreCase("s");
        }

    }
    public void mostrarTodasLasPeliculas(ArrayList<Pelicula> peliculas){
        System.out.println("Todas las Peliculas:");
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
    public void ordenarPeliculasAsce(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas de mayor a menor duracion:");
        for (int i = 0; i < peliculas.size(); i++) {
            for (int j = 0; j < peliculas.size() - 1; j++) {
                if (peliculas.get(j).getDuracion() < peliculas.get(j + 1).getDuracion()) {
                    Pelicula aux = peliculas.get(j);
                    peliculas.set(j, peliculas.get(j + 1));
                    peliculas.set(j + 1, aux);
                }
            }
        }
        mostrarTodasLasPeliculas(peliculas);
    }
    /**
     * Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
     * pantalla.
     */
    public void ordenarPeliculasDesc(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas de menor a mayor duracion:");
        for (int i = 0; i < peliculas.size(); i++) {
            for (int j = 0; j < peliculas.size() - 1; j++) {
                if (peliculas.get(j).getDuracion() > peliculas.get(j + 1).getDuracion()) {
                    Pelicula aux = peliculas.get(j);
                    peliculas.set(j, peliculas.get(j + 1));
                    peliculas.set(j + 1, aux);
                }
            }
        }
        mostrarTodasLasPeliculas(peliculas);
    }
    /**
     * Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     */
    public void ordenarPeliculasTitulo(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas por titulo:");
        //Ordenar por titulo
    }


}
