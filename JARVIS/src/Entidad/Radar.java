package Entidad;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Radar {
    private Objeto[] enemigos = crearEnemigos();


    public Radar() {
    }

    public Radar(Objeto[] enemigos) {
        this.enemigos = enemigos;
    }

    public Objeto[] getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(Objeto[] enemigos) {
        this.enemigos = enemigos;
    }
    public Objeto[] crearEnemigos(){
        Objeto[] enemigos = new Objeto[10];
        Random random = new Random();
        int num = random.nextInt(10)+1;
        for (int i = 0; i < num; i++) {
            enemigos[i]=new Objeto();
        }
        return enemigos;
    }
    public void mostrarObjetos(){
        int num = 0;
        System.out.println("Enemigos Detectados: ");
        for (int i = 0; i < enemigos.length; i++) {
            if (enemigos[i] != null && enemigos[i].isEnemigo()){
                num++;
                System.out.println("Distancia al enemigo "+(num)+": "+enemigos[i].getDinstancia()+" metros");
            }
        }
    }
}
