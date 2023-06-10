package Entidad;

import java.util.Random;

public class Armadura {
    protected Reactor reactor = new Reactor();
    protected Radar radar = new Radar();
    protected Bota botas = new Bota();
    protected Guante guantes = new Guante();
    public Armadura() {
    }

    public Armadura(Reactor reactor, Bota botas) {
        this.reactor = reactor;
        this.botas = botas;
    }

    public Reactor getReactor() {
        return reactor;
    }

    public void setReactor(Reactor reactor) {
        this.reactor = reactor;
    }

    public Bota getBotas() {
        return botas;
    }

    public void setBotas(Bota botas) {
        this.botas = botas;
    }

    public Radar getRadar() {
        return radar;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
    }

    public Guante getGuantes() {
        return guantes;
    }

    public void setGuantes(Guante guantes) {
        this.guantes = guantes;
    }

    public void caminar(){
        Random random = new Random();
        int tiempoCaminando = random.nextInt(10)+1;
        System.out.println("Caminando por "+tiempoCaminando+" segundo/s.");
        reactor.setCargaReactor(reactor.getCargaReactor()-(botas.getConsumo()*tiempoCaminando));

    }
    public void correr(){
        Random random = new Random();
        int tiempoCorriendo = random.nextInt(10)+1;
        System.out.println("Corriendo por "+tiempoCorriendo+" segundo/s.");
        reactor.setCargaReactor(reactor.getCargaReactor()-(botas.getConsumo()*2*tiempoCorriendo));
    }
    public void propulsarse(){
        Random random = new Random();
        int tiempoPropulsando = random.nextInt(10)+1;
        System.out.println("Propulsando por "+tiempoPropulsando+" segundo/s.");
        reactor.setCargaReactor(reactor.getCargaReactor()-(botas.getConsumo()*3*tiempoPropulsando));
    }
    public void volar(){
        //Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
        //consumiendo el triple de la energía establecida para las botas y el doble para los guantes.
        Random random = new Random();
        int tiempoVuelo = random.nextInt(10)+1;
        System.out.println("Volando por "+tiempoVuelo+" segundo/s.");
        reactor.setCargaReactor(reactor.getCargaReactor()-((botas.getConsumo()*3*tiempoVuelo)+guantes.getConsumo()*2*tiempoVuelo));
    }
    public void atacar(){
        //Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
        Random random = new Random();
        int tiempoDisparo = random.nextInt(10)+1;
        System.out.println("Disparando por "+tiempoDisparo+" segundo/s.");
        reactor.setCargaReactor(reactor.getCargaReactor()-(guantes.getConsumo()*3*tiempoDisparo));
    }
}
