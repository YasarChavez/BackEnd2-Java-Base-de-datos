package Guia10Colecciones.Servicios;

import Guia10Colecciones.Entidad.Receta;

import java.util.ArrayList;
import java.util.Scanner;

public class RecetaService {
    Scanner leer = new Scanner(System.in);
    /**
     * Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
     * crea métodos para agregar nuevas recetas a la lista, para buscar una
     * receta por nombre y para obtener la lista de recetas que se pueden
     * preparar con los ingredientes disponibles en la cocina.
     */

    public void crearReceta(ArrayList<Receta> recetas) {
        System.out.println("Ingrese el nombre de la receta");
        String nombre = leer.next();
        System.out.println("Ingrese el ingrediente 1:");
        String ingrediente1 = leer.next();
        System.out.println("Ingrese el ingrediente 2:");
        String ingrediente2 = leer.next();
        System.out.println("Ingrese el ingrediente 3:");
        String ingrediente3 = leer.next();
        Receta receta = new Receta(nombre, ingrediente1, ingrediente2, ingrediente3);
        recetas.add(receta);

    }
    public void buscarReceta(ArrayList<Receta> recetas) {
        System.out.println("Ingrese el nombre de la receta a buscar");
        String nombre = leer.next();
        for (Receta receta : recetas) {
            if (receta.getNombre().equals(nombre)) {
                System.out.println(receta);
            }
        }

    }
    public void obtenerRecetasDisponiblesConIngredientes(ArrayList<Receta> recetas) {
        System.out.println("Ingrese los ingredientes de la cocina");
        String ingrediente1 = leer.next();
        String ingrediente2 = leer.next();
        String ingrediente3 = leer.next();
        System.out.println("Las recetas disponibles con los ingredientes de la cocina son:");

        for (Receta receta : recetas) {
        //verificar si la receta tiene todos los ingredientes
                if (receta.getIngrediente1().equals(ingrediente1) && receta.getIngrediente2().equals(ingrediente2) && receta.getIngrediente3().equals(ingrediente3)) {
                    System.out.println("Receta disponible:");
                    System.out.println(receta);
                }
            }
        }
    }

