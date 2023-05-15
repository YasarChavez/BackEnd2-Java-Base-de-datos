package Guia11Relaciones.Entidades;

public class Cartas {
    private String numero;
    private String palo;

    public Cartas() {
    }

    public Cartas(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero+" de "+palo;
    }
}
