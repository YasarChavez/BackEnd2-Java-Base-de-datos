package Guia10Colecciones;

import Guia10Colecciones.Entidad.Pelicula;
import Guia10Colecciones.Servicios.PeliculaService;

import java.util.ArrayList;

public class Ejerc04 {
    public static void main(String[] args) {
        PeliculaService peliculaService  = new PeliculaService();
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculaService.crearPelicula(peliculas);
        peliculaService.mostrarTodasLasPeliculas(peliculas);
        peliculaService.mostrarPelicusMasUnaHora(peliculas);











    }
}
