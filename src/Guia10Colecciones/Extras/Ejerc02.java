package Guia10Colecciones.Extras;

import Guia10Colecciones.Entidad.CantanteFamoso;
import Guia10Colecciones.Servicios.CantanteFamosoService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
 * tendrá como atributos el nombre y discoConMasVentas.
 * Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
 * objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
 * cada cantante y su disco con más ventas por pantalla.
 * Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
 * agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
 * usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
 * cambios.
 */
public class Ejerc02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CantanteFamosoService  service = new CantanteFamosoService();
        ArrayList<CantanteFamoso> lista = new ArrayList<>();
        lista.add(new CantanteFamoso("Tu piel", "Pure Negga"));
        lista.add(new CantanteFamoso("Lady Gaga", "Bad Romance"));
        lista.add(new CantanteFamoso("Beyonce", "Lemonade"));
        lista.add(new CantanteFamoso("Justin Bieber", "Baby"));
        lista.add(new CantanteFamoso("Lil Wayne", "Lil Wayne"));
        int menu = 0;
        do {
            System.out.println("1. Agregar cantante");
            System.out.println("2. Mostrar cantantes");
            System.out.println("3. Eliminar cantante");
            System.out.println("4. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    service.agregarCantanteFamoso(lista);
                    break;
                case 2:
                    service.mostrarCantantes(lista);
                    break;
                case 3:
                    service.eliminarCantante(lista);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (menu != 4);
        System.out.println();
        System.out.println("Lista Final");
        service.mostrarCantantes(lista);
    }
}
