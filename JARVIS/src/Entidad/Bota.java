package Entidad;

import java.util.Random;

public class Bota {
    private float consumo = 1;
    private boolean sano = true;
    private boolean destruido = false;

    private Propulsor propulsorBota = new Propulsor();


    public Bota() {
    }

    public Bota(float consumo, boolean sano, boolean destruido) {
        this.consumo = consumo;
        this.sano = sano;
        this.destruido = destruido;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    public Propulsor getPropulsorBota() {
        return propulsorBota;
    }

    public void setPropulsorBota(Propulsor propulsorBota) {
        this.propulsorBota = propulsorBota;
    }

    @Override
    public String toString() {
        return "Bota{" +
                "consumo=" + consumo +
                ", sano=" + sano +
                ", destruido=" + destruido +
                ", propulsorBota=" + propulsorBota +
                '}';
    }
}
