package Guia10Colecciones;

import Guia10Colecciones.Servicios.TiendaService;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
public class Ejerc06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TiendaService  tiendaService = new TiendaService();
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("arroz", 10.0);
        productos.put("leche", 5.0);
        productos.put("pan", 2.0);
        int menu = 0;
        do {
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    tiendaService.agregarProducto(productos);
                    break;
                case 2:
                    tiendaService.modificarProducto(productos);
                    break;
                case 3:
                    tiendaService.eliminarProducto(productos);
                    break;
                case 4:
                    tiendaService.mostrarProductos(productos);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (menu!= 5);

    }
}
