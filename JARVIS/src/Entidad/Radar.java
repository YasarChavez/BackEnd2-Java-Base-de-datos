package Entidad;

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

    public Objeto[] crearEnemigos() {
        Objeto[] enemigos = new Objeto[10];
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        for (int i = 0; i < num; i++) {
            enemigos[i] = new Objeto();
        }
        return enemigos;
    }

    public int mostrarObjetos() {
        int num = 0;
        int disCercana = 10000;
        int numEnemigo = 0;

        System.out.println("Enemigos Detectados: ");
        for (int i = 0; i < enemigos.length; i++) {
            if (enemigos[i] != null && enemigos[i].isEnemigo()) {
                num++;
                if (enemigos[i].getDinstancia() < disCercana) {
                    disCercana = enemigos[i].getDinstancia();
                    numEnemigo = i;
                }
                System.out.println("Distancia al enemigo " + (num) + ": " + enemigos[i].getDinstancia() + " metros" + "Salud del enemigo: " + enemigos[i].getResistencia());
            }
        }

        //Mostrar el mas cercano
        System.out.println("El enemigo mas cercano está a : " + enemigos[numEnemigo].getDinstancia() + " metros");
        return enemigos[numEnemigo].getDinstancia();
    }
    public void atacar(Armadura armadura) {
        Random random = new Random();
        //Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
        armadura.llamarConsola();

        int disEnemigo = mostrarObjetos();
        int ataque = 100;

        if(disEnemigo<2000){
            ataque = 80;
        }else if(disEnemigo<3000){
            ataque = 60;
        }else if(disEnemigo<4000){
            ataque = 40;
        }else if(disEnemigo<5000){
            ataque = 20;
        }
        //TODO continuar acá

        int tiempoDisparo = random.nextInt(10) + 1;
        System.out.println();
        System.out.println("Atacando al enemigo a : " + disEnemigo + " metros");
        int numEnemigo = 0;
        for (int i = 0; i < enemigos.length; i++) {
            if (enemigos[i] != null && enemigos[i].isEnemigo()) {
                if (enemigos[i].getDinstancia() == disEnemigo) {
                    numEnemigo = i;
                    enemigos[i].setResistencia(enemigos[i].getResistencia() - ataque*tiempoDisparo);
                }
                if (enemigos[i].getResistencia() <= 0) {
                    enemigos[i] = null;
                }
            }
        }

        System.out.println("Disparando por " + tiempoDisparo + " segundo/s.");
        armadura.getReactor().setCargaReactor(armadura.getReactor().getCargaReactor() - (ataque * tiempoDisparo));
        System.out.println("Cantidad de energia consumida: " + (armadura.getGuantes().getConsumo() * 3 * tiempoDisparo));
        if (enemigos[numEnemigo] == null) {
            System.out.println("El enemigo ha sido eliminado");
        }else {
            System.out.println("Salud del enemigo: " + enemigos[numEnemigo].getResistencia());
        }

    }
}
