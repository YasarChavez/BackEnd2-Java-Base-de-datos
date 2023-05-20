import Entidad.Receta;
import Servicio.RecetaService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea una clase "Cocina" que tenga una lista de objetos "Entidad.Receta". Luego,
 * crea métodos para agregar nuevas recetas a la lista, para buscar una
 * receta por nombre y para obtener la lista de recetas que se pueden
 * preparar con los ingredientes disponibles en la cocina.
 */
public class Ejerc05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RecetaService recetaService = new RecetaService();
        ArrayList<Receta> recetas = new ArrayList<>();
        Receta receta1 = new Receta("Receta1", "Agua", "Sal", "Harina");
        recetas.add(receta1);
        Receta receta2 = new Receta("Receta2", "Papas", "Sal", "Huevos");
        recetas.add(receta2);
        Receta receta3 = new Receta("Receta3", "Piña", "Aceite", "Sal");
        recetas.add(receta3);
        int menu = 0;
        do {
            System.out.println("1. Agregar receta");
            System.out.println("2. Buscar receta");
            System.out.println("3. Obtener recetas disponibles con los ingredientes que hay en la cocina");
            System.out.println("4. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    recetaService.crearReceta(recetas);
                    break;
                case 2:
                    recetaService.buscarReceta(recetas);
                    break;
                case 3:
                    recetaService.obtenerRecetasDisponiblesConIngredientes(recetas);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (menu != 4);
    }
}
