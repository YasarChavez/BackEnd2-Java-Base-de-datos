package Entidad;

public class Cartas {
    private String numero;
    private Palos palo;

    public Cartas() {
    }

    public Cartas(String numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
