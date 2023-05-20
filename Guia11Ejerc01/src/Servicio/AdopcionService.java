package Servicio;

import Entidad.Perro;
import Entidad.Persona;

import java.util.Scanner;

public class AdopcionService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Realizar un programa para que una Entidad.Persona pueda adoptar un Entidad.Perro. Vamos a contar de dos
     * clases. Entidad.Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Entidad.Persona con
     * atributos: nombre, apellido, edad, documento y Entidad.Perro.
     * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
     * pensar la lógica necesaria para asignarle a cada Entidad.Persona un Entidad.Perro y por ultimo, mostrar desde
     * la clase Entidad.Persona, la información del Entidad.Perro y de la Entidad.Persona.
     */
    public Persona crearPersona() {
        //Datos persona
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona:");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona:");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento de la persona:");
        persona.setDocumento(leer.next());
        return persona;
    }

    public Perro crearPerro() {
        //Datos perro
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro:");
        perro.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro:");
        perro.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro:");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro:");
        perro.setTamano(leer.next());
        return perro;
    }


}
