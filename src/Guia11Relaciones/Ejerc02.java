package Guia11Relaciones;


import Guia11Relaciones.Entidades.Jugador;
import Guia11Relaciones.Entidades.Revolver;
import Guia11Relaciones.Servicios.RuletaService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
 * un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
 * se dispara y se moja. Las clases por hacer del juego son las siguientes:
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
 * del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
 * tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 */
public class Ejerc02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        RuletaService ruletaService = new RuletaService();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Revolver revolver = new Revolver();
        System.out.println();
        ruletaService.llenarJuego(jugadores, revolver);
        System.out.println();
        System.out.println("Disparando: ");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Posicion revolver: " + revolver.getPosActual() + "\nPosicion agua: " + revolver.getPosAgua());
            boolean muerto = !ruletaService.ronda(jugadores.get(i), revolver);
            System.out.println(jugadores.get(i).getNombre() + " Se dispara!");
            if (ruletaService.disparo(jugadores.get(i), revolver)) {
                System.out.println("El " + jugadores.get(i).getNombre() + " Murio :/");
//                muerto = true;
            } else {
                System.out.println("Sigue vivo!");
                System.out.println();
                ruletaService.siguienteChorro(revolver);
            }
            if (muerto) {
                break;
            }
        }
    }
}
