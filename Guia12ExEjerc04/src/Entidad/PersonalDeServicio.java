package Entidad;

public class PersonalDeServicio extends Empleados {
    //hay que conocer a qué sección están asignados
    //(biblioteca, decanato, secretaría, ...).
    protected String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String nombre, String apellidos, int identificacion, String estadoCivil, int anioIncorp, int numDespacho, String seccion) {
        super(nombre, apellidos, identificacion, estadoCivil, anioIncorp, numDespacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    //• Traslado de sección de un empleado del personal de servicio.
    public void trasladarSeccion() {
        System.out.println("Ingrese la nueva seccion:");
        this.seccion = leer.next();
    }

    @Override
    public String toString() {
        return
                "Nombre" + nombre + '\'' +
                        ", Apellidos " + apellidos + '\'' +
                        ", Identificacion " + identificacion +
                        ", Estado Civil " + estadoCivil + '\'' +
                        ", Seccion " + seccion + '\'' +
                        ", Anio De Incorporacion " + anioIncorp +
                        ", NumDespacho " + numDespacho;
    }
}
