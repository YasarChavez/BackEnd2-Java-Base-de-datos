package Guia10Colecciones.Entidad;

import java.util.ArrayList;

/**
 * Su nombre y una lista de tipo Integer
 *  con sus 3 notas.
 */
public class Alumno {
    private String Nombre;
    private ArrayList<Integer> Notas = new ArrayList<>(3);

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        Nombre = nombre;
        Notas = notas;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        Notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "Nombre='" + Nombre + '\'' +
                ", Notas=" + Notas +
                '}';
    }
}
