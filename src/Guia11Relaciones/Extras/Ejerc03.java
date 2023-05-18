package Guia11Relaciones.Extras;

import Guia11Relaciones.Servicios.SeguroService;

import java.util.Scanner;

public class Ejerc03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        SeguroService seguroService = new SeguroService();

        int menu = 0;
        do {
            System.out.println();
            System.out.println("Elija una opcion: ");
            System.out.println("1. Cargar Clientes");
            System.out.println("2. Cargar Vehiculos");
            System.out.println("3. Crear Seguros(Poliza)");
            System.out.println("4. Mostrar Seguros");
            System.out.println("5. Mostrar Clientes");
            System.out.println("6. Mostrar Vehiculos");
            System.out.println("7. Gestion de Cuotas");
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
                case 5:
                    seguroService.mostrarClientes();
                    break;
                case 6:
                    seguroService.mostrarVehiculos();
                    break;
                case 7:
                    seguroService.gestionarCuotas();
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
