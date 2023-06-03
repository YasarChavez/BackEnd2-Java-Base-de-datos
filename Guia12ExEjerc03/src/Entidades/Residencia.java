package Entidades;

public class Residencia extends Alojamiento {
    //Para las residencias se
    //indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
    //campo deportivo.
    protected int habitaciones;
    protected boolean descuentos;
    protected boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, int habitaciones, boolean descuentos, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "habitaciones=" + habitaciones +
                ", descuentos=" + descuentos +
                ", campoDeportivo=" + campoDeportivo +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
