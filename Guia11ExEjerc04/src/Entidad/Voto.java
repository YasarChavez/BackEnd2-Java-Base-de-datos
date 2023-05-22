package Entidad;

import java.util.ArrayList;

/**
 * Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
 * un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
public class Voto {
    private Alumno alumno;
    private ArrayList<Alumno> listaAlumnos;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> listaAlumnos) {
        this.alumno = alumno;
        this.listaAlumnos = listaAlumnos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "alumno=" + alumno +
                ", listaAlumnos=" + listaAlumnos +
                '}';
    }
}
