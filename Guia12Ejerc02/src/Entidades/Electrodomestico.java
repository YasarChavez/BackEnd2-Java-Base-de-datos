package Entidades;

import java.util.Scanner;

/**
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
 * consumo energético (letras entre A y F) y peso.
 * Los constructores que se deben implementar son los siguientes:
 * • Un constructor vacío.
 * • Un constructor con todos los atributos pasados por parámetro.
 */
public class Electrodomestico {
    protected Double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Double peso;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") ||
                color.equalsIgnoreCase("negro") ||
                color.equalsIgnoreCase("rojo") ||
                color.equalsIgnoreCase("azul") ||
                color.equalsIgnoreCase("gris")) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        this.precio = 1000.0;

        System.out.println("Ingrese el color del electrodomestico");
        this.color = leer.next();
        comprobarColor(color);

        System.out.println("Ingrese el consumo energetico del electrodomestico");
        this.consumoEnergetico = leer.next().toUpperCase().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);

        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = leer.nextDouble();
    }

    public void precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        if (peso > 0 && peso < 20) {
            this.precio += 100;
        } else if (peso >= 20 && peso < 50) {
            this.precio += 500;
        } else if (peso >= 50 && peso < 80) {
            this.precio += 800;
        } else if (peso >= 80) {
            this.precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
