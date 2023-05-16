package Guia11Relaciones.Entidades;

public class Butaca {
    private String numero;
    private String letra;
    private String estado;

    public Butaca() {
    }

    public Butaca(String numero, String letra, String estado) {
        this.numero = numero;
        this.letra = letra;
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return numero + letra + estado + "|";
    }
}
