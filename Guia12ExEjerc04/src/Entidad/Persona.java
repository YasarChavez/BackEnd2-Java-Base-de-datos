package Entidad;

import java.util.Scanner;

public class Persona {
    //Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
    //identificación y su estado civil.
    protected String nombre;
    protected String apellidos;
    protected int identificacion;
    protected String estadoCivil;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil() {
        System.out.println("Ingrese el nuevo estado civil: ");
        String estadoCivil = leer.next();
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", identificacion=" + identificacion +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
