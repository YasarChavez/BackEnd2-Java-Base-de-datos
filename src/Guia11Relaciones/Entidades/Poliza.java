package Guia11Relaciones.Entidades;

import java.util.Calendar;

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
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private int cantidadCuotas;
    private String formaPago;
    private double montoAsegurado;
    private boolean granizo;
    private double montoMaximoGranizo;
    private String tipoCobertura;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private boolean pagada;

    public Poliza() {
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Calendar fechaFin) {
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

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "numeroPoliza=" + numeroPoliza +
                '}';
    }
}
