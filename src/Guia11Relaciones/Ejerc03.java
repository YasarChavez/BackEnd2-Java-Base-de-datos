package Guia11Relaciones;

import Guia11Relaciones.Servicios.BarajaService;

import java.util.Scanner;

public class Ejerc03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BarajaService barajaService = new BarajaService();

        int menu = 0;
        do {
            System.out.println("1. Crear baraja");
            System.out.println("2. Mezclar baraja");
            System.out.println("3. Dar cartas");
            System.out.println("4. Mostrar cartas del monton");
            System.out.println("5. Cartas disponibles");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("*--------------------------*");
                    barajaService.crearBaraja();
                    break;
                case 2:
                    System.out.println("*--------------------------*");
                    barajaService.barajar();
                    break;
                case 3:
                    System.out.println("*--------------------------*");
                    barajaService.darCartas();
                    break;
                case 4:
                    System.out.println("*--------------------------*");
                    barajaService.cartasMonton();
                    break;
                case 5:
                    System.out.println("*--------------------------*");
                    barajaService.cartasDisponibles();
                    break;
                case 6:
                    System.out.println("*--------------------------*");
                    barajaService.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("*--------------------------*");
        } while (menu != 7);
    }
}
