package Entidad;

import java.util.Arrays;
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
    public void mostrarObjetos(Objeto[] enemigos){
        System.out.println("Enemigos Detectados: ");
        for (int i = 0; i < enemigos.length; i++) {
            if (enemigos[i] != null && enemigos[i].isEnemigo()){

                System.out.println("Distancia al enemigo "+(i+1)+enemigos[i].getDinstancia()+" metros");
            }
        }
    }
}
