package Servicio;

import Entidad.Alumno;
import Enums.ApellidosEnum;
import Enums.NombresEnum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class SimuladorService {
    /**
     * La clase Simulador debe tener un método que genere un listado de alumnos manera
     * aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
     * manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> nombreMasApellido = new ArrayList<>();
    HashSet<String> listaDNI = new HashSet<>();
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public void generarListadoAlumnos(int cantidad) {
        int cantidadAlumnos = cantidad;
        Random random = new Random();
        for (int i = 0; i < cantidadAlumnos; i++) {
            nombreMasApellido.add(NombresEnum.values()[random.nextInt(NombresEnum.values().length)].name()
                    + " " + ApellidosEnum.values()[random.nextInt(ApellidosEnum.values().length)]);
        }
        System.out.println("Alumnos Generados");
    }


    /**
     * Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
     * rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
     * debe retornar la lista de dnis.
     */
    public void generarDni(int cantidad) {
        Random random = new Random();
        do {
            for (int i = 0; i < nombreMasApellido.size(); i++) {
                listaDNI.add(String.valueOf(random.nextInt(60000000) + 20000000));
            }
        } while (listaDNI.size() < nombreMasApellido.size());
    }
    public void crearAlumnos() {
        System.out.println("Cuantos Alumnos desea crear?");
        int cantidad = leer.nextInt();
        generarListadoAlumnos(cantidad);
        generarDni(cantidad);
        for (int i = 0; i < nombreMasApellido.size(); i++) {
            Alumno alumno = new Alumno();
            String nombre = nombreMasApellido.get(i);
            String dni = listaDNI.iterator().next();
            alumno.setNombreCompleto(nombre);
            alumno.setDni(listaDNI.iterator().next());
            listaAlumnos.add(alumno);
            listaDNI.remove(dni);

        }

    }


    public void mostrarAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
    /**
     * Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
     * para cada alumno genera tres votos de manera aleatoria. En este método debemos
     * guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
     * votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
     * Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
     * mismo alumno. Utilizar un hashset para resolver esto.f
     */

}
