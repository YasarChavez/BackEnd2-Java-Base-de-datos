package Guia10Colecciones.Extras;

import Guia10Colecciones.Entidad.Libro;
import Guia10Colecciones.Servicios.LibreriaService;

import java.util.HashSet;
import java.util.Scanner;

/**
 * También se creará en el main un HashSet de tipo Libro que guardará todos los libros
 * creados.
 * En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
 * sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
 * se le pregunta al usuario si quiere crear otro Libro o no.
 */
public class Ejerc03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibreriaService libreriaService = new LibreriaService();
        HashSet<Libro> libroHashSet = new HashSet<>();
        libroHashSet.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 5, 2));
        libroHashSet.add(new Libro("El Quijote", "Miguel de Cervantes", 3, 3));
        libroHashSet.add(new Libro("Harry Potter", "J.K. Rowling", 4, 1));

        int menu = 0;
        do {
            System.out.println("1. Agregar libro/s");
            System.out.println("2. Pedir libro prestado");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            switch (menu){
                case 1:
                    boolean crearOtroLibro = true;
                    while (crearOtroLibro){
                        Libro libro = new Libro();
                        System.out.println("Ingrese el titulo:");
                        libro.setTitulo(leer.nextLine());
                        System.out.println("Ingrese el autor:");
                        libro.setAutor(leer.nextLine());
                        System.out.println("Ingrese el numero de ejemplares:");
                        libro.setNumeroDeEjemplares(leer.nextInt());
                        System.out.println("Ingrese el numero de ejemplares prestados:");
                        libro.setGetNumeroDeEjemplaresPrestados(leer.nextInt());
                        leer.nextLine();
                        libroHashSet.add(libro);
                        System.out.println("¿Desea crear otro libro? (s/n)");
                        String respuesta = leer.next();
                        crearOtroLibro = respuesta.equalsIgnoreCase("s");
                        leer.nextLine();
                    }
                    break;
                case 2:
                    libreriaService.prestamo(libroHashSet);
                    break;
                case 3:
                    libreriaService.devolucion(libroHashSet);
                    break;
                case 4:
                    libreriaService.mostrarlibros(libroHashSet);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while (menu!=5);





    }
}
