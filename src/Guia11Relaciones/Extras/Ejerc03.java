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
            System.out.println("1. Cargar Clientes");
            System.out.println("2. Cargar Vehiculos");
            System.out.println("3. Crear Seguros");
            System.out.println("4. Mostrar Seguros");
            System.out.println("8. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    seguroService.cargarClientes();
                    break;
                case 2:
                    seguroService.cargarVehiculos();
                    break;
                case 3:
                    seguroService.crearSeguros();
                    break;
                case 4:
                    seguroService.mostrarSeguros();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (menu != 8);
    }
}
