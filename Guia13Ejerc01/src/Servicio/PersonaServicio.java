package Servicio;

import Entidad.Persona;


import java.util.Scanner;

public class PersonaServicio {
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo: (H,M,O)");
        String sexo;
        do {
            sexo = leer.next();
        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        System.out.println("Ingrese el peso:");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura:");
        double altura = leer.nextDouble();
        System.out.println();
        System.out.println();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona) {
//        imc= p/(t*t)
        int estado = 2;
        double imc = (persona.getPeso() / (persona.getAltura() * persona.getAltura()));
        if (imc < 20) {
            estado = -1;
        } else if (imc >= 20 && imc <= 25) {
            estado = 0;
        } else if (imc > 25) {
            estado = 1;
        }
        return estado;
    }
}