package Guia11Relaciones.Extras;

import Guia11Relaciones.Entidades.Cine;
import Guia11Relaciones.Entidades.Espectador;
import Guia11Relaciones.Entidades.SalaCine;
import Guia11Relaciones.Servicios.CineService;

import java.util.Scanner;


public class Ejerc02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CineService cineService = new CineService();
        SalaCine salaCine = cineService.crearSalaCine();
        Espectador espectador1 = new Espectador("Juanito",25,500.0);

        System.out.println("Ingrese el precio de las peliculas:");
        double precio = leer.nextDouble();

        Cine cine=cineService.crearCine(salaCine.getPelicula(),salaCine,precio);
        cineService.mostrarSalaCine(salaCine);
        cineService.venderButaca(cine,salaCine,espectador1);
        cineService.mostrarSalaCine(salaCine);


    }
}
