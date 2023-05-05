package Guia10Colecciones;

import Guia10Colecciones.Entidad.Pelicula;
import Guia10Colecciones.Servicios.PeliculaService;

import java.util.ArrayList;

public class Ejerc04 {
    public static void main(String[] args) {
        PeliculaService peliculaService = new PeliculaService();

//        peliculas.add(new Pelicula("La verdad duele", "Ciencia ficción", 1));
//        peliculas.add(new Pelicula("El señor de los anillos", "Fantasia", 2));
//        peliculas.add(new Pelicula("El padrino", "Drama", 1));
//        peliculas.add(new Pelicula("La vida es bella", "Comedia", 2));
        peliculaService.crearPelicula();
        System.out.println("Peliculas: ");
        peliculaService.mostrarTodasLasPeliculas();
        System.out.println(" ");
        peliculaService.mostrarPelicusMasUnaHora();
        System.out.println(" ");
        peliculaService.ordenarPeliculasDesc();
        System.out.println(" ");
        peliculaService.ordenarPeliculasAsce();
        System.out.println(" ");
        peliculaService.ordenarPeliculasTitulo();
        System.out.println(" ");
        peliculaService.ordenarPeliculasDirector();
        System.out.println(" ");
        peliculaService.mostrarTodasLasPeliculas();
    }
}
