package Guia11Relaciones.Servicios;

import Guia11Relaciones.Entidades.Cartas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BarajaService {
    Scanner leer = new Scanner(System.in);
    ArrayList<Cartas> cartas = new ArrayList<>();
    ArrayList<Cartas> cartasDadas = new ArrayList<>();

    public void crearBaraja() {
        if (cartas.size() > 0){
            System.out.println("Ya existe una baraja");
        }else{
            System.out.println("Creando baraja...");
            String[] palo = {"Espadas", "Bastos", "Copas", "Oros"};
            String[] numero = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};
//        String[] numero = {"1", "2"};
            for (int i = 0; i < palo.length; i++) {
                for (int j = 0; j < numero.length; j++) {
                    cartas.add(new Cartas(numero[j], palo[i]));
                }
            }
//            for (Cartas carta : cartas) {
//                System.out.println(carta);
//            }
            System.out.println("Se creó la baraja correctamente!");
        }
    }

    public void barajar() {
        System.out.println("Barajando...");
        for (int i = 0; i < cartas.size(); i++) {
            int j = (int) (Math.random() * cartas.size());
            Cartas aux = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, aux);
        }
        System.out.println("Se mezcló la baraja completamente!");
    }

    public Cartas siguienteCarta() {
        Cartas carta = new Cartas();
        if (cartas.size() == 0) {
            System.out.println("No hay cartas");
        } else {
            carta = cartas.get(0);
        }
        return carta;
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + cartas.size());
    }

    public void darCartas() {
        System.out.println("Ingrese la cantidad de cartas que desea dar:");
        int cantidad = leer.nextInt();
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas");
        } else {
            int cont = 0;
            while (cont < cantidad) {
//                System.out.println(cartas.get(0)); //Para ver las cartas
                System.out.println("Se dio la carta: " + cartas.get(0) + " al jugador");
                cartasDadas.add(cartas.get(0));
                cartas.remove(0);
                cont++;
            }
        }
    }

    public void cartasMonton() {
        System.out.println("Cartas del monton: " + cartasDadas.size());
        for (Cartas carta : cartasDadas) {
            System.out.println(carta);
        }
    }

    public void mostrarBaraja() {
        System.out.println("Cartas de la baraja:");
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
    }
}
