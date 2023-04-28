package Guia10Colecciones.Servicios;

import Guia10Colecciones.Entidad.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    /**
     * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
     * toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
     * pregunta al usuario si quiere crear otro Alumno o no.
     */

    public void crearAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = scanner.next();
            ArrayList<Integer> Notas = new ArrayList<>(3);
            System.out.println("Ingrese las notas del alumno");
            for (int i = 0; i < 3; i++) {
                Notas.add(scanner.nextInt());
            }
            Alumno alumno = new Alumno(nombre, Notas);
            alumnos.add(alumno);
            System.out.println("Desea agregar otro alumno? (s/n)");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));

        mostrarAlumnos(alumnos);
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
