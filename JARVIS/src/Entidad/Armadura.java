package Entidad;

import java.util.Random;

public class Armadura {
    protected Reactor reactor = new Reactor();
    protected Radar radar = new Radar();
    protected Bota botas = new Bota();
    protected Guante guantes = new Guante();
    protected Consola consola = new Consola();


    Random random = new Random();

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

    public void caminar() {
        llamarConsola();

        int tiempoCaminando = random.nextInt(10) + 1;
        System.out.println("Caminando por " + tiempoCaminando + " segundo/s.");
        reactor.setCargaReactor(reactor.getCargaReactor() - (botas.getConsumo() * tiempoCaminando));
        System.out.println("Cantidad de energia consumida: " + (botas.getConsumo() * tiempoCaminando));

    }

    public void correr() {
        llamarConsola();

        int tiempoCorriendo = random.nextInt(10) + 1;
        System.out.println("Corriendo por " + tiempoCorriendo + " segundo/s.");
        reactor.setCargaReactor(reactor.getCargaReactor() - (botas.getConsumo() * 2 * tiempoCorriendo));
        System.out.println("Cantidad de energia consumida: " + (botas.getConsumo() * 2 * tiempoCorriendo));
    }

    public void propulsarse() {
        llamarConsola();

        int tiempoPropulsando = random.nextInt(10) + 1;
        System.out.println("Propulsando por " + tiempoPropulsando + " segundo/s.");
        reactor.setCargaReactor(reactor.getCargaReactor() - (botas.getConsumo() * 3 * tiempoPropulsando));
        System.out.println("Cantidad de energia consumida: " + (botas.getConsumo() * 3 * tiempoPropulsando));
    }

    public void volar() {
        //Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
        //consumiendo el triple de la energía establecida para las botas y el doble para los guantes.
        llamarConsola();

        int tiempoVuelo = random.nextInt(10) + 1;
        System.out.println("Volando por " + tiempoVuelo + " segundo/s.");
        reactor.setCargaReactor(reactor.getCargaReactor() - ((botas.getConsumo() * 3 * tiempoVuelo) + guantes.getConsumo() * 2 * tiempoVuelo));
        System.out.println("Cantidad de energia consumida: " + ((botas.getConsumo() * 3 * tiempoVuelo) + guantes.getConsumo() * 2 * tiempoVuelo));
    }

    public void llamarConsola() {
        reactor.setCargaReactor(reactor.getCargaReactor() - consola.getConsumo());
    }

    public int mostrarEnemigos() {
        return radar.mostrarObjetos();
    }
}
