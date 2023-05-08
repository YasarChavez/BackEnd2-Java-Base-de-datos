package Guia10Colecciones;

import Guia10Colecciones.Entidad.Pelicula;
import Guia10Colecciones.Servicios.PeliculaService;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class Ejerc04 {
    public static void main(String[] args) {
        PeliculaService peliculaService = new PeliculaService();
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
