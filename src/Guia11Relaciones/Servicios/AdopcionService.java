package Guia11Relaciones.Servicios;

import Guia11Relaciones.Entidades.Perro;
import Guia11Relaciones.Entidades.Persona;

import java.util.Scanner;

public class AdopcionService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
     * clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
     * atributos: nombre, apellido, edad, documento y Perro.
     * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
     * pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
     * la clase Persona, la información del Perro y de la Persona.
     */
    public Persona crearPersona(){
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
    public Perro crearPerro(){
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
