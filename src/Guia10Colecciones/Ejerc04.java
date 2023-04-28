package Guia10Colecciones;

import Guia10Colecciones.Entidad.Pelicula;
import Guia10Colecciones.Servicios.PeliculaService;

import java.util.ArrayList;

public class Ejerc04 {
    public static void main(String[] args) {
        PeliculaService peliculaService  = new PeliculaService();
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("La verdad duele", "Ciencia ficción", 1));
        peliculas.add(new Pelicula("El señor de los anillos", "Fantasia", 2));
        peliculas.add(new Pelicula("El padrino", "Drama", 1));
        peliculas.add(new Pelicula("La vida es bella", "Comedia", 2));
//        peliculaService.crearPelicula(peliculas);
        System.out.println("Peliculas: ");
        peliculaService.mostrarTodasLasPeliculas(peliculas);
        System.out.println(" ");
        peliculaService.mostrarPelicusMasUnaHora(peliculas);
        System.out.println(" ");
        peliculaService.ordenarPeliculasDesc(peliculas);
        System.out.println(" ");
        peliculaService.ordenarPeliculasAsce(peliculas);
        System.out.println(" ");
        peliculaService.ordenarPeliculasTitulo(peliculas);
        System.out.println(" ");
        peliculaService.ordenarPeliculasDirector(peliculas);
        System.out.println(" ");
        peliculaService.mostrarTodasLasPeliculas(peliculas);
    }
}
