package Guia11Relaciones.Entidades;

import java.util.ArrayList;

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
 * Revolver
 * Métodos:
 * • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
 * y el revolver para guardarlos en los atributos del juego.
 * <p>
 * • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
 * aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
 * moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
 * mojar. Al final del juego, se debe mostrar que jugador se mojó.
 * Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class Juego {
    private ArrayList<Jugador> jugadoresList;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadorArrayList, Revolver revolverObj) {
        this.jugadoresList = jugadorArrayList;
        this.revolver = revolverObj;
    }

    public ArrayList<Jugador> getJugadorArrayList() {
        return jugadoresList;
    }

    public void setJugadorArrayList(ArrayList<Jugador> jugadorArrayList) {
        this.jugadoresList = jugadorArrayList;
    }

    public Revolver getRevolverObj() {
        return revolver;
    }

    public void setRevolverObj(Revolver revolverObj) {
        this.revolver = revolverObj;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "revolver=" + revolver +
                '}';
    }
}
