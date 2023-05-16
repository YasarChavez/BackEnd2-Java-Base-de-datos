package Guia11Relaciones.Servicios;

import Guia11Relaciones.Entidades.Jugador;
import Guia11Relaciones.Entidades.Persona;
import Guia11Relaciones.Entidades.Revolver;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Métodos:
 * • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
 * deben ser aleatorios.
 * • mojar(): devuelve true si la posición del agua coincide con la posición actual
 * • siguienteChorro(): cambia a la siguiente posición del tambor
 * • toString(): muestra información del revolver (posición actual y donde está el agua)
 *
 * disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
 * mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
 * revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
 * devuelve true, sino false.
 */
public class RuletaService {
    ArrayList<Jugador> jugadoresList = new ArrayList<>();
    public void llenarJuego(ArrayList<Jugador> jugadoresList,Revolver revolver){
        for (int i=0; i<6;i++){
            Jugador playerX = new Jugador();
            playerX.setId((i+1));
            playerX.setNombre("Jugador "+(i+1));
            jugadoresList.add(playerX);
        }
        llenarRevolver(revolver);
    }
    public boolean mojar(Revolver revolverObj){
        boolean seMurio=false;
        if (revolverObj.getPosActual()==revolverObj.getPosAgua()){
            seMurio=true;
        }
        return seMurio;
    }
    public boolean disparo(Jugador jugador, Revolver revolverObj){
        boolean seMurio = false;
        if (mojar(revolverObj)){
            jugador.setMojado(true);
            seMurio=true;
        }
        return seMurio;
    }
    public boolean ronda(Jugador jugador,Revolver revolverObj){
        boolean juegoSigue = true;
        if (disparo(jugador,revolverObj)){
            juegoSigue=false;
        }
        return juegoSigue;
    }

    public void llenarRevolver(Revolver revolverObj){
        Random random = new Random();
        revolverObj.setPosActual(random.nextInt(6)+1);
        revolverObj.setPosAgua(random.nextInt(6)+1);
    }

    public void siguienteChorro(Revolver revolverObj){
        if (revolverObj.getPosActual()<6){
            revolverObj.setPosActual(revolverObj.getPosActual()+1);
        }else if (revolverObj.getPosActual()==6){
            revolverObj.setPosActual(1);
        }
    }

}
