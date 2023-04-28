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

    public void crearAlumnos(ArrayList<Alumno> alumnos) {

        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = scanner.next();
            ArrayList<Integer> Notas = new ArrayList<>();
            System.out.println("Ingrese las notas del alumno");
            for (int i = 0; i < 3; i++) {
                Notas.add(scanner.nextInt());
            }
            Alumno alumno = new Alumno(nombre, Notas);
            alumnos.add(alumno);
            System.out.println("Desea agregar otro alumno? (s/n)");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));


    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void notaFinal(ArrayList<Alumno> alumnos) {
        System.out.println("Ingrese el nombre del alumno a obtener promedio:");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        int promedio = 0;
        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                for (int nota : alumno.getNotas()) {
                    promedio += nota;
                }
                System.out.println("El promedio del alumno es: " + promedio / 3);
            }
        }
        if (!encontrado) {
            System.out.println("El alumno no existe");
        }
    }

    public void eliminarAlumno(ArrayList<Alumno> alumnos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a eliminar:");
        String nombre = scanner.next();
        boolean encontrado = false;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                alumnos.remove(i);
                encontrado = true;
            }
        }
        if (encontrado){
            System.out.println("Alumno eliminado!");
        }else {
            System.out.println("No existe el alumno!!!");
        }
    }
    public void modificarAlumno(ArrayList<Alumno> alumnos){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a modificar:");
        String nombre = leer.nextLine();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre));{
                System.out.println("Nuevo nombre:");
                String nuevoNombre = leer.nextLine();
                alumnos.get(i).setNombre(nuevoNombre);
            }
        }
    }
}
