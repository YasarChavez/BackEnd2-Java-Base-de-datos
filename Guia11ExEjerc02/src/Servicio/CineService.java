package Servicio;

import Entidad.*;
import Enums.NombresEnum;

import java.util.Random;
import java.util.Scanner;

public class CineService {
    Butaca[][] asientos = new Butaca[8][6];
    String[] filas = {"8", "7", "6", "5", "4", "3", "2", "1"};
    String[] columnas = {"A", "B", "C", "D", "E", "F"};
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        Pelicula peliculaX = new Pelicula();
        System.out.println("Ingrese el nombre de la Pelicula:");
        peliculaX.setTitulo(leer.next());
        System.out.println("Ingrese la duracion de la Pelicula:");
        peliculaX.setDuracion(leer.nextDouble());
        System.out.println("Ingrese la edad minima de la Pelicula:");
        peliculaX.setEdadMinima(leer.nextInt());
        System.out.println("Ingrese el director de la Pelicula:");
        peliculaX.setDirector(leer.next());
        return peliculaX;
    }

    public Cine crearCine(Pelicula pelicula, SalaCine salaCine, double precio) {
        Cine cineX = new Cine(pelicula, salaCine, precio);
        return cineX;
    }

    public Espectador crearEspectadores() {
        Random random = new Random();
        Espectador espectadorObj = new Espectador();
        espectadorObj.setNombre(NombresEnum.values()[random.nextInt(NombresEnum.values().length)].name());
        espectadorObj.setEdad(random.nextInt(99) + 18);
        espectadorObj.setDineroDisponible(random.nextInt(3000) + 400);
        return espectadorObj;
    }

    public SalaCine crearSalaCine() {

        SalaCine salaX = new SalaCine(asientos, filas, columnas);
        //Asignar valores a los asientos
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                Random random = new Random();
                int randomNum = random.nextInt(2);
                if (randomNum == 0) {
                    asientos[i][j] = new Butaca(filas[i], columnas[j], " ");
                } else {
                    asientos[i][j] = new Butaca(filas[i], columnas[j], "X");
                }
            }
        }
        salaX.setPelicula(crearPelicula());
        return salaX;
    }

    public void mostrarSalaCine(Cine cine, SalaCine salaCine) {
        System.out.println("Pelicula: " + salaCine.getPelicula().getTitulo());
        System.out.println("Precio : " + cine.getPrecio());
        for (Butaca[] butacas : salaCine.getButacas()) {
            for (Butaca butaca : butacas) {
                System.out.print(butaca);
            }
            System.out.println(" ");
        }
    }

    public void venderButaca(Cine cine, SalaCine salaCine, Espectador espectador) {
        //Validar que el espectador tenga la edad minima
        boolean mayorEdad = espectador.getEdad() >= salaCine.getPelicula().getEdadMinima();
        if (!mayorEdad) {
            System.out.println("Espectador menor de edad");
        }
        //Validar que el espectador tenga dinero suficiente
        boolean dineroSuficiente = espectador.getDineroDisponible() >= cine.getPrecio();
        if (!dineroSuficiente) {
            System.out.println("Espectador no cuenta con dinero suficiente");
        }
        if (mayorEdad && dineroSuficiente) {
            boolean ubicado = false;
            do {
                System.out.println("Ingrese la fila de la Butaca (1,2,3,4,5,6,7,8)");
                String fila = leer.next();
                int filas = Math.abs(Integer.parseInt(fila) - 8);
                System.out.println("Ingrese la columna de la Butaca (A/1 B/2 C/3 D/4 E/5 F/6)");
                String columna = leer.next();
                int columnas = Integer.parseInt(columna) - 1;
                //Validar Butaca disponible
                if (asientos[filas][columnas].getEstado().equals(" ")) {
                    asientos[filas][columnas].setEstado("X");
                    System.out.println("Se ha vendido la Butaca");
                    espectador.setDineroDisponible(espectador.getDineroDisponible() - cine.getPrecio());
                    ubicado = true;
                } else {
                    System.out.println("Butaca no disponible");
                }
            } while (!ubicado);
            mostrarSalaCine(cine, salaCine);
        }
    }
}
