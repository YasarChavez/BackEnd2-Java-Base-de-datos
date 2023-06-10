package Entidad;

public class Sintetizador {
    private  float consumo = 1;

    public Sintetizador() {
    }

    public Sintetizador(float consumo) {
        this.consumo = consumo;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Sintetizador{" +
                "consumo=" + consumo +
                '}';
    }
}
