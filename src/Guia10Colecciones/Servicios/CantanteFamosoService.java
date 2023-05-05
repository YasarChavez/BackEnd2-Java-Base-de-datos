package Guia10Colecciones.Servicios;

import Guia10Colecciones.Entidad.CantanteFamoso;

import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoService {
    Scanner leer = new Scanner(System.in);

    public void agregarCantanteFamoso(ArrayList<CantanteFamoso> lista){
        String  respuesta;
        do{
            CantanteFamoso cantante = new CantanteFamoso();
            System.out.println("Ingrese el nombre del cantante:");
            cantante.setNombre(leer.nextLine());
            System.out.println("Ingrese el disco con mas ventas:");
            cantante.setDiscoConMasVentas(leer.nextLine());
            lista.add(cantante);
            System.out.println("Desea agregar otro cantante? s/n");
            respuesta=leer.next();
        }while (respuesta.equalsIgnoreCase("s"));

    }

    public void mostrarCantantes(ArrayList<CantanteFamoso> lista) {
        for (CantanteFamoso cantante : lista) {
            System.out.println(cantante);
        }
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> lista) {
        System.out.println("Ingrese el nombre del cantante a eliminar:");
        String nombre = leer.nextLine();
        for (CantanteFamoso cantante : lista) {
            if (cantante.getNombre().equalsIgnoreCase(nombre)) {
                lista.remove(cantante);
                break;
            }
        }
    }
}
