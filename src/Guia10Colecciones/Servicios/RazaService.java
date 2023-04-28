package Guia10Colecciones.Servicios;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
/**
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
 * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
 * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
 * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
 * la lista ordenada.
 */
public class RazaService {
    public void crearRaza(ArrayList<String> razas){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese una raza de perro: ");
            razas.add(leer.nextLine());
            System.out.println("¿Desea agregar otra raza de perro? (S/N)");
            continuar = leer.nextLine().equalsIgnoreCase("s");
        }
        mostrarRazas(razas);
    }

    public void mostrarRazas(ArrayList<String> razas){
        System.out.println("Razas de perros: ");
        for(String raza : razas){
            System.out.println(raza);
        }
    }

    public void eliminarRaza(ArrayList<String> razas){
        Scanner leer = new Scanner(System.in);
        String raza;
        boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese una raza de perro a eliminar: ");
            raza = leer.nextLine();
            if(razas.contains(raza)){
                razas.remove(raza);
                System.out.println("Raza eliminada");
            }else{
                System.out.println("Raza no encontrada");
            }
            System.out.println("¿Desea eliminar otra raza de perro? (S/N)");
            continuar = leer.nextLine().equalsIgnoreCase("s");
        }
        mostrarRazas(razas);
    }
    //Eliminar raza con iterator
    public void eliminarRazaIterator(ArrayList<String> razas){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una raza de perro a eliminar: ");
        String raza = leer.nextLine();
        Iterator<String> it = razas.iterator();
        boolean eliminada = false;
        while (it.hasNext()){
            String aux = it.next();
            if (aux.equalsIgnoreCase(raza)){
                it.remove();
                eliminada = true;
            }
        }
        if (eliminada){
            System.out.println("Raza eliminada");
        }else {
            System.out.println("Raza no encontrada");
        }
        razas.sort(null);
        mostrarRazas(razas);


    }

}
