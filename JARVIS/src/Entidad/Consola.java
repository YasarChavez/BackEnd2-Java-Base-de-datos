package Entidad;

public class Consola {
    private float consumo = 1;

    public Consola() {
    }

    public Consola(float consumo) {
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
        return "Consola{" +
                "consumo=" + consumo +
                '}';
    }
}
