package Guia11Relaciones.Entidades;

/**
 * Se registra la información de cada vehículo asegurado. Marca,
 * modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double numeroMotor;
    private String chasis;
    private String color;
    private String tipo;
    private Polizas poliza;
    private Clientes duenio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, double numeroMotor, String chasis, String color, String tipo, Polizas poliza, Clientes duenio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.poliza = poliza;
        this.duenio = duenio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(double numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Polizas getPoliza() {
        return poliza;
    }

    public void setPoliza(Polizas poliza) {
        this.poliza = poliza;
    }

    public Clientes getDuenio() {
        return duenio;
    }

    public void setDuenio(Clientes duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "vehiculosSeguro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", numeroMotor=" + numeroMotor +
                ", chasis='" + chasis + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", poliza=" + poliza +
                ", duenio=" + duenio +
                '}';
    }
}
