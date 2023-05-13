package Guia11Relaciones.Entidades;

import java.util.Random;

/**
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
 * del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
 * tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 */
public class Revolver {

    private int posActual;
    private int posAgua;

    public Revolver() {
    }

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posActual=" + posActual +
                ", posAgua=" + posAgua +
                '}';
    }

}
