package Entidad;

import java.util.Random;

public class Objeto {
    Random random = new Random();
    private int resistencia = 100;
    private boolean enemigo = esEnemigo();
    private int posX = random.nextInt(5000)+1;
    private int posY = random.nextInt(5000)+1;
    private int posZ = random.nextInt(5000)+1;

    private int dinstancia = calcDistancia();

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

    public int calcDistancia(){
        int dis = 0;
        if (posX>posY && posX>posZ){
            dis = posX;
        }else if(posY>posX && posY>posZ){
            dis= posY;
        }else{
            dis=posZ;
        }
        return dis;
    }
    public boolean esEnemigo(){
        int ene = random.nextInt(2)+1;
        return ene == 1;
    }
}
