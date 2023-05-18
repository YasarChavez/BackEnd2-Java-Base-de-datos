package Guia11Relaciones.Entidades;

import java.util.Date;

/**
 * Se registrarán y podrán consultar las cuotas generadas en cada póliza.
 * Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
 * cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
 * etc.).
 */
public class Cuotas {
    private Polizas poliza;
    private int numeroCuota;
    private int montoTotalCuota;
    private boolean pagada;
    private Date fechaVencimiento;
    private String formaPago;

    public Cuotas() {
    }

    public Cuotas(Polizas poliza, int numeroCuota, int montoTotalCuota, boolean pagada, Date fechaVencimiento, String formaPago) {
        this.poliza = poliza;
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public Polizas getPoliza() {
        return poliza;
    }

    public void setPoliza(Polizas poliza) {
        this.poliza = poliza;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public int getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(int montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "cuotasSeguro{" +
                "poliza=" + poliza +
                ", numeroCuota=" + numeroCuota +
                ", montoTotalCuota=" + montoTotalCuota +
                ", pagada=" + pagada +
                ", fechaVencimiento=" + fechaVencimiento +
                ", formaPago='" + formaPago + '\'' +
                '}';
    }
}
