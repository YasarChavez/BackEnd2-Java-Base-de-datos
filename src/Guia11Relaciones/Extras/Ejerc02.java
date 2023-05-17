package Guia11Relaciones.Extras;

import Guia11Relaciones.Entidades.Cine;
import Guia11Relaciones.Entidades.Espectador;
import Guia11Relaciones.Entidades.SalaCine;
import Guia11Relaciones.Servicios.CineService;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejerc02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CineService cineService = new CineService();
        SalaCine salaCine = cineService.crearSalaCine();
        ArrayList<Espectador> espectadores = new ArrayList<>();
        Espectador espectador1 = new Espectador("Juanito", 25, 500.0);
        espectadores.add(espectador1);
        Espectador espectador2 = new Espectador("Pepito", 30, 450.0);
        espectadores.add(espectador2);
        Espectador espectador3 = new Espectador("Pepa", 35, 300.0);
        espectadores.add(espectador3);
        Espectador espectador4 = new Espectador("Pepita", 17, 600.0);
        espectadores.add(espectador4);

        System.out.println("Ingrese el precio de las peliculas:");
        double precio = leer.nextDouble();

        Cine cine = cineService.crearCine(salaCine.getPelicula(), salaCine, precio);
        cineService.mostrarSalaCine(cine, salaCine);
        for (int i = 0; i < espectadores.size(); i++) {
            System.out.println("Vendiendo butaca a: " + espectadores.get(i).getNombre());
            System.out.println("Dinero disponible: " + espectadores.get(i).getDineroDisponible());
            System.out.println("Edad: " + espectadores.get(i).getEdad());
            cineService.venderButaca(cine, salaCine, espectadores.get(i));
        }
    }
}
