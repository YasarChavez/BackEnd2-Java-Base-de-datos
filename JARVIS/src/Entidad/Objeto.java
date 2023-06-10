package Entidad;

import java.util.Random;

public class Objeto {
    Random random = new Random();
    private int resistencia = 100;
    private boolean enemigo = esEnemigo();
    private int posX = random.nextInt(3000) + 1;
    private int posY = random.nextInt(3000) + 1;
    private int posZ = random.nextInt(3000) + 1;

    private int dinstancia = calcDistancia(posX, posY, posZ);

    public Objeto() {
    }

    public Objeto(Random random, int resistencia, boolean enemigo, int posX, int posY, int posZ, int dinstancia) {
        this.random = random;
        this.resistencia = resistencia;
        this.enemigo = enemigo;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
        this.dinstancia = dinstancia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isEnemigo() {
        return enemigo;
    }

    public void setEnemigo(boolean enemigo) {
        this.enemigo = enemigo;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosZ() {
        return posZ;
    }

    public void setPosZ(int posZ) {
        this.posZ = posZ;
    }

    public int getDinstancia() {
        return dinstancia;
    }

    public void setDinstancia(int dinstancia) {
        this.dinstancia = dinstancia;
    }

    public int calcDistancia(int posX, int posY, int posZ) {
        double distancia = Math.sqrt(posX * posX + posY * posY + posZ * posZ);
        if (distancia > 5000) {
            distancia = 5000;
        }
        return (int) distancia;
    }

    public boolean esEnemigo() {
        int ene = random.nextInt(2);
        return ene > 0;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "resistencia=" + resistencia +
                ", enemigo=" + enemigo +
                ", posX=" + posX +
                ", posY=" + posY +
                ", posZ=" + posZ +
                ", dinstancia=" + dinstancia +
                '}';
    }
}
