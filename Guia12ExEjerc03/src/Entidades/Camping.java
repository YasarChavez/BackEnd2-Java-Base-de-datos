package Entidades;

import java.util.Scanner;

public class Camping extends Alojamiento {
    //Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
    //disponibles y si posee o no un restaurante dentro de las instalaciones.
    protected int capacidadMaximaCarpas;
    protected int cantidadBanos;
    protected boolean poseeRestaurante;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Camping() {
    }

    public Camping(String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, int capacidadMaximaCarpas, int cantidadBanos, boolean poseeRestaurante) {
        super(nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.poseeRestaurante = poseeRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(int cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean isPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" +
                "capacidadMaximaCarpas=" + capacidadMaximaCarpas +
                ", cantidadBaños=" + cantidadBanos +
                ", poseeRestaurante=" + poseeRestaurante +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }

    public Camping crearCamping() {
        System.out.println("Ingrese el nombre del alojamiento");
        this.nombre = leer.next();
        System.out.println("Ingrese la dirección del alojamiento");
        this.direccion = leer.next();
        System.out.println("Ingrese la localidad del alojamiento");
        this.localidad = leer.next();
        System.out.println("Ingrese el gerente del alojamiento");
        this.gerente = leer.next();
        System.out.println("Ingrese la capacidad máxima de carpas");
        this.capacidadMaximaCarpas = leer.nextInt();
        System.out.println("Ingrese la cantidad de baños");
        this.cantidadBanos = leer.nextInt();
        System.out.println("Ingrese si posee restaurante (1=Si, 0=No)");
        this.poseeRestaurante = leer.nextInt() == 1 ? true : false;
        return this;
    }
}
