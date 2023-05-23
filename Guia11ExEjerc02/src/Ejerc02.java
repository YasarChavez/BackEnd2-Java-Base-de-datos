import Entidad.Cine;
import Entidad.Espectador;
import Entidad.SalaCine;
import Servicio.CineService;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejerc02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CineService cineService = new CineService();
        SalaCine salaCine = cineService.crearSalaCine();
        ArrayList<Espectador> espectadores = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            espectadores.add(cineService.crearEspectadores());
        }

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
