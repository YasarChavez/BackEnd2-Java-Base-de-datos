import Entidad.Perro;
import Entidad.Persona;
import Servicio.AdopcionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Realizar un programa para que una Entidad.Persona pueda adoptar un Entidad.Perro. Vamos a contar de dos
 * clases. Entidad.Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Entidad.Persona con
 * atributos: nombre, apellido, edad, documento y Entidad.Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 * pensar la lógica necesaria para asignarle a cada Entidad.Persona un Entidad.Perro y por ultimo, mostrar desde
 * la clase Entidad.Persona, la información del Entidad.Perro y de la Entidad.Persona.
 */
public class Ejerc01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AdopcionService adopcionService = new AdopcionService();
        List<Persona> personas = new ArrayList();
        List<Perro> perrosAdopcion = new ArrayList();
        //Cargar personas
        System.out.println("Cargar Personas");
        for (int i = 0; i < 2; i++) {
            System.out.println("Entidad.Persona " + (i + 1) + ":");
            personas.add(adopcionService.crearPersona());
        }
        //Cargar perros
        System.out.println("Cargar Perros");
        for (int i = 0; i < 2; i++) {
            System.out.println("Entidad.Perro " + (i + 1) + ":");
            perrosAdopcion.add(adopcionService.crearPerro());
        }
        System.out.println("Adoptando Perros:");
        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() +
                    " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perrosAdopcion) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String adoptable = leer.next();
            int ctrol = 0;
            for (int i = 0; i < perrosAdopcion.size(); i++) {
                if (adoptable.equalsIgnoreCase(perrosAdopcion.get(i).getNombre())) {
                    aux.setPerro(perrosAdopcion.get(i));
                    ctrol++;
                    perrosAdopcion.remove(i);
                }
            }
            if (ctrol == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }
        System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " ha adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());
            }

        }


    }
}
