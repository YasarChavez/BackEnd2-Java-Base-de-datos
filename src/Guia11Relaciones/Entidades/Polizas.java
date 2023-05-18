package Guia11Relaciones.Entidades;

/**
 * Se registrará una póliza, donde se guardará los datos tanto de un
 * vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
 * póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
 * asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
 * terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
 * relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
 * muchos a uno o de muchos a muchos.
 */
public class Polizas {
    private Vehiculo vehiculo;
    private Clientes cliente;
    private double numeroPoliza;
    private String fechaInicio;
    private String fechaFin;
    private int numeroCuotas;
    private String formaPago;
    private double totalAsegurado;
    private boolean incluyeGranizo;
    private double montoMaximoGranizo;
    private String tipoCobertura;

    public Polizas() {
    }

    public Polizas(Vehiculo vehiculo, Clientes cliente, double numeroPoliza, String fechaInicio, String fechaFin, int numeroCuotas, String formaPago, double totalAsegurado, boolean incluyeGranizo, double montoMaximoGranizo, String tipoCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroCuotas = numeroCuotas;
        this.formaPago = formaPago;
        this.totalAsegurado = totalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public double getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(double numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getTotalAsegurado() {
        return totalAsegurado;
    }

    public void setTotalAsegurado(double totalAsegurado) {
        this.totalAsegurado = totalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "polizasSeguro{" +
                "vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                ", numeroPoliza=" + numeroPoliza +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", numeroCuotas=" + numeroCuotas +
                ", formaPago='" + formaPago + '\'' +
                ", totalAsegurado=" + totalAsegurado +
                ", incluyeGranizo=" + incluyeGranizo +
                ", montoMaximoGranizo=" + montoMaximoGranizo +
                ", tipoCobertura='" + tipoCobertura + '\'' +
                '}';
    }
}
