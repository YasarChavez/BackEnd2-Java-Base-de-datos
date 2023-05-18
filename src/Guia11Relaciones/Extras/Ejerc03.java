package Guia11Relaciones.Extras;

import Guia11Relaciones.Servicios.SeguroService;

import java.util.Scanner;

public class Ejerc03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        SeguroService seguroService = new SeguroService();
        System.out.println("Elija una opcion: ");
        int menu = 0;
        do {
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Vehiculos");
            System.out.println("3. Gestionar Seguros");
            System.out.println("4. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    seguroService.gestionarClientes();
                    break;
                case 2:
                    seguroService.gestionarVehiculos();
                    break;
                case 3:
                    seguroService.gestionarSeguros();
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (menu != 4);
    }
}
