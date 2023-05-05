package Guia10Colecciones.Servicios;

import java.util.*;

public class PaisesService {
    public void agregarPaises(HashSet<String> paises) {
        Scanner leer = new Scanner(System.in);
        String pais;
        boolean bandera = true;
        do {
            System.out.println("Ingrese un país: ");
            pais = leer.nextLine();
            paises.add(pais);
            System.out.println("¿Desea agregar otro país? (S/N)");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                bandera = false;
            }
        } while (bandera);
    }

    public void mostrarPaises(HashSet<String> paises) {
        ArrayList<String> paisesList = new ArrayList<>(paises);
        System.out.println("Paises:");
        Collections.sort(paisesList);
//        paisesList.sort(Comparator.naturalOrder());
        for (String paisesordenado : paisesList) {
            System.out.println(paisesordenado);
        }
    }

    public void eliminarPaises(HashSet<String> paises) {
        Iterator<String> it = paises.iterator();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el pais a eliminar: ");
        String pais = leer.nextLine();
        boolean eliminada = false;
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(pais)) {
                it.remove();
                eliminada = true;
            }
        }
        if (eliminada) {
            System.out.println("Pais eliminado");
        } else {
            System.out.println("Pais no encontrado");
        }
    }

}
