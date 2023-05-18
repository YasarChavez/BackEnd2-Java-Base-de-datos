package Guia11Relaciones.Entidades;

import java.util.ArrayList;

/**
 * En este módulo vamos a registrar la información personal de
 * cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
 * domicilio, teléfono.
 */
public class Clientes {
    private String nombre;
    private String apellido;
    private double documento;
    private String mail;
    private String domicilio;
    private double telefono;
    private ArrayList<Polizas> polizas;
    private ArrayList<Vehiculo> vehiculos;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, double documento, String mail, String domicilio, double telefono, ArrayList<Polizas> polizas, ArrayList<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.polizas = polizas;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Polizas> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Polizas> polizas) {
        this.polizas = polizas;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Cliente:" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Documento: " + documento + "\n" +
                "Mail: " + mail + "\n" +
                "Domicilio: " + domicilio + "\n" +
                "Telefono: " + telefono + "\n" +
                "Polizas: " + polizas + "\n" +
                "Vehiculos: " + vehiculos + "\n";
    }
}
