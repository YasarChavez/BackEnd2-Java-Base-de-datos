package Entidad;

import java.util.ArrayList;

public class Cliente {
    /**
     * Nombre y apellido, documento, mail,
     * domicilio, teléfono.
     */
    private String nombre;
    private String apellido;
    private double documento;
    private String mail;
    private String domicilio;
    private String telefono;
    private ArrayList<Vehiculo> vehiculoArrayList = new ArrayList<>();
    private ArrayList<Poliza> polizaArrayList = new ArrayList<>();

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, double documento, String mail, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public ArrayList<Poliza> getPolizaArrayList() {
        return polizaArrayList;
    }

    public void setPolizaArrayList(ArrayList<Poliza> polizaArrayList) {
        this.polizaArrayList = polizaArrayList;
    }

    public ArrayList<Vehiculo> getVehiculoArrayList() {
        return vehiculoArrayList;
    }

    public void setVehiculoArrayList(ArrayList<Vehiculo> vehiculoArrayList) {
        this.vehiculoArrayList = vehiculoArrayList;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Entidad.Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", mail='" + mail + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono='" + telefono + '\'' +
                ", vehiculoArrayList=" + vehiculoArrayList +
                ", polizaArrayList=" + polizaArrayList +
                '}';
    }
}
