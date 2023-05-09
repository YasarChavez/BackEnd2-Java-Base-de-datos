package Guia10Colecciones.Servicios;

import java.util.HashMap;
import java.util.Map;
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
public class PostalesService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public void cargarCodigos(HashMap<Integer, String> codPostales) {
        System.out.println("Ingrese 3 ciudades con sus codigos postales:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Cod Postal, luego la ciudad.");
            int cod = leer.nextInt();
//            leer.next();
            String ciudad = leer.next();
            codPostales.put(cod, ciudad);
        }


    }

    public void cargarUnCodigo(HashMap<Integer, String> codPostales) {
        System.out.println("Ingrese una ciudad con su codigo postal:");
        System.out.println("Ingrese Cod Postal, luego la ciudad.");
        int cod = leer.nextInt();

        String ciudad = leer.next();
        codPostales.put(cod, ciudad);


    }

    public void mostrarCodigos(HashMap<Integer, String> codPostales) {
        for (Map.Entry<Integer, String> cod : codPostales.entrySet()) {
            System.out.println(cod.getValue() + " " + cod.getKey());
        }

    }

    public void buscarCodigo(HashMap<Integer, String> codPostales) {
        System.out.println("Ingrese un codigo postal:");
        int codi = leer.nextInt();
        String ciudad = codPostales.get(codi);
        if (ciudad != null) {
            System.out.println("La ciudad es: " + ciudad);
        } else {
            System.out.println("No se encontró la ciudad.");
        }
    }

    public void eliminarCodigos(HashMap<Integer, String> codPostales) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un codigo postal a elimar:");
            int cod = leer.nextInt();
            boolean encontrada = false;
            if (codPostales.containsKey(cod)) {
                codPostales.remove(cod);
                encontrada = true;
            }
            if (encontrada) {
                System.out.println("Se elimino la ciudad.");
            } else {
                System.out.println("Ciudad no encontrada.");
            }

        }
    }


}
