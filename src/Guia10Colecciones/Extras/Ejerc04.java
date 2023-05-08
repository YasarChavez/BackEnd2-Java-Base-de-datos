package Guia10Colecciones.Extras;

import Guia10Colecciones.Servicios.PostalesService;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
 * página: https://mapanet.eu/index.htm
 * Nota: Poner el código postal sin la letra, solo el numero.
 * • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
 * • Muestra por pantalla los datos introducidos
 * • Pide un código postal y muestra la ciudad asociada si existe sino avisa al
 * usuario.
 * • Muestra por pantalla los datos
 * • Agregar una ciudad con su código postal correspondiente más al HashMap.
 * • Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
 * • Muestra por pantalla los datos
 */
public class Ejerc04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<Integer,String> codPostales = new HashMap<>();
        PostalesService postalesService = new PostalesService();
        codPostales.put(3000,"Sant Fe");
        codPostales.put(1655,"Jose Leon Suarez");
        codPostales.put(1836,"Lomas de Zamora");
        codPostales.put(2520,"Las Rosas");
        codPostales.put(1822,"Lanus");
        codPostales.put(2000,"Rosario");
        codPostales.put(1876,"Quilmes");

        int menu = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Ingresar TRES Ciudades");
            System.out.println("2. Buscar Ciudad");
            System.out.println("3. Agregar UNA Ciudad");
            System.out.println("4. Eliminar TRES Ciudades");
            System.out.println("5. Mostrar Ciudades");
            System.out.println("6. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    postalesService.cargarCodigos(codPostales);
                    break;
                case 2:
                    postalesService.buscarCodigo(codPostales);
                    break;
                case 3:
                    postalesService.cargarUnCodigo(codPostales);
                    break;
                case 4:
                    postalesService.eliminarCodigos(codPostales);
                    break;
                case 5:
                    postalesService.mostrarCodigos(codPostales);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (menu != 6);

    }
}
