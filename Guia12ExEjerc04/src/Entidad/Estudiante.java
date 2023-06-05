package Entidad;

public class Estudiante extends Persona {
    protected String curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, int identificacion, String estadoCivil, String curso) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Matriculación de un estudiante en un nuevo curso.
    public void matricular() {
        System.out.println("Ingrese el nombre del curso: ");
        curso = leer.next();
    }

    @Override
    public String toString() {
        return
                "Nombre'" + nombre + '\'' +
                        ", Apellidos " + apellidos + '\'' +
                        ", Identificacion " + identificacion +
                        ", EstadoCivil " + estadoCivil + '\'' +
                        ", Curso'" + curso + '\'';
    }
}
