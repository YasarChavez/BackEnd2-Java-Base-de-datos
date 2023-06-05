package Entidad;

public class Profesores extends Empleados {
    //es necesario gestionar a qué departamento
    //pertenecen (lenguajes, matemáticas, arquitectura, ...).
    protected String departamento;

    public Profesores() {
    }

    public Profesores(String nombre, String apellidos, int identificacion, String estadoCivil, int anioIncorp, int numDespacho, String departamento) {
        super(nombre, apellidos, identificacion, estadoCivil, anioIncorp, numDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //cambio de departamento de un profesor.
    public void cambioDeDepartamento() {
        System.out.println("Ingrese el nuevo departamento:");
        this.departamento = leer.next();
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + '\'' +
                ", Apellidos " + apellidos + '\'' +
                ", Identificacion " + identificacion +
                ", EstadoCivil " + estadoCivil + '\'' +
                ", Departamento " + departamento + '\'' +
                ", Anio De Incorporacion " + anioIncorp +
                ", NumDespacho=" + numDespacho;
    }
}
