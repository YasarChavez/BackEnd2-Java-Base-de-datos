package Entidades;

public class Camping extends Alojamiento {
    //Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
    //disponibles y si posee o no un restaurante dentro de las instalaciones.
    protected int capacidadMaximaCarpas;
    protected int cantidadBaños;
    protected boolean poseeRestaurante;

    public Camping() {
    }

    public Camping(String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, int capacidadMaximaCarpas, int cantidadBaños, boolean poseeRestaurante) {
        super(nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBaños = cantidadBaños;
        this.poseeRestaurante = poseeRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBaños() {
        return cantidadBaños;
    }

    public void setCantidadBaños(int cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
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
                ", cantidadBaños=" + cantidadBaños +
                ", poseeRestaurante=" + poseeRestaurante +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
