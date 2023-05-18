package Guia11Relaciones.Entidades;

public class Poliza {
    /**
     * Se registrará una póliza, donde se guardará los datos tanto de un
     * vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
     * póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
     * asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
     * terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
     * relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
     * muchos a uno o de muchos a muchos.
     */
    private int numeroPoliza;
    private String fechaInicio;
    private String fechaFin;
    private int cantidadCuotas;
    private String formaPago;
    private double montoAsegurado;
    private boolean granizo;
    private double montoMaximoGranizo;
    private String tipoCobertura;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public Poliza() {
    }

    public Poliza(int numeroPoliza, String fechaInicio, String fechaFin, int cantidadCuotas, String formaPago, double montoAsegurado, boolean granizo, double montoMaximoGranizo, String tipoCobertura, Vehiculo vehiculo, Cliente cliente) {
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
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

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "numeroPoliza=" + numeroPoliza +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", cantidadCuotas=" + cantidadCuotas +
                ", formaPago='" + formaPago + '\'' +
                ", montoAsegurado=" + montoAsegurado +
                ", granizo=" + granizo +
                ", montoMaximoGranizo=" + montoMaximoGranizo +
                ", tipoCobertura='" + tipoCobertura + '\'' +
                ", vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                '}';
    }
}
