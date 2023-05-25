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
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Double peso;

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
    /**
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
     * sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
     * objeto y no será visible.
     */
    public void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }
    /**
     * Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
     * usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
     * blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
     * minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
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
    /**
     * Metodo crearElectrodomestico(): le pide la información al usuario y llena el
     * electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
     * precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {
//        System.out.println("Ingrese el precio del electrodomestico");
//        this.precio = leer.nextDouble();
        this.precio = 1000.0;

        System.out.println("Ingrese el color del electrodomestico");
        this.color = leer.next();
        comprobarColor(color);

        System.out.println("Ingrese el consumo energetico del electrodomestico");
        this.consumoEnergetico = leer.next().toUpperCase().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);

        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = leer.nextDouble();
        precioFinal();
    }
    /**
     * Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
     * precio. Esta es la lista de precios:
     * LETRA PRECIO
     * A $1000
     * B $800
     * C $600
     * D $500
     * E $300
     * F $100
     *
     * PESO PRECIO
     * Entre 1 y 19 kg $100
     * Entre 20 y 49 kg $500
     * Entre 50 y 79 kg $800
     * Mayor que 80 kg $1000
     */
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
