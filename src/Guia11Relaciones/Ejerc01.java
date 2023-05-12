package Guia11Relaciones;

import Guia11Relaciones.Entidades.Perro;
import Guia11Relaciones.Entidades.Persona;
import Guia11Relaciones.Servicios.AdopcionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
 * clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
 * atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 * pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
 * la clase Persona, la información del Perro y de la Persona.
 */
public class Ejerc01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AdopcionService adopcionService  = new AdopcionService();
        List<Persona> personas = new ArrayList();
        List<Perro> perrosAdopcion = new ArrayList();
        //Cargar personas
        System.out.println("Cargar Personas");
        for (int i = 0; i < 2; i++) {
            System.out.println("Persona "+(i+1)+":");
            personas.add(adopcionService.crearPersona());
        }
        //Cargar perros
        System.out.println("Cargar Perros");
        for (int i = 0; i < 2; i++) {
            System.out.println("Perro "+(i+1)+":");
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
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());
            }

        }





    }
}
