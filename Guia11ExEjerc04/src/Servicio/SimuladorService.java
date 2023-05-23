package Servicio;

import Entidad.Alumno;
import Entidad.Voto;
import Enums.ApellidosEnum;
import Enums.NombresEnum;

import java.util.*;

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
    ArrayList<Voto> listaVotos = new ArrayList<>();

    public void generarListadoAlumnos(int cantidad) {
        int cantidadAlumnos = cantidad;
        Random random = new Random();
        for (int i = 0; i < cantidadAlumnos; i++) {
            nombreMasApellido.add(NombresEnum.values()[random.nextInt(NombresEnum.values().length)].name()
                    + " " + ApellidosEnum.values()[random.nextInt(ApellidosEnum.values().length)]);
        }
//        System.out.println("Alumnos Generados...\n");
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
//        int cantidad = 12;
        if (cantidad < 11) {
            System.out.println("No puede crear menos de 11 alumnos");
            System.out.println("Creando 11 alumnos por defecto");
            cantidad = 11;
        }
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
        System.out.println("Alumnos Creados...\n");
    }


    public void mostrarAlumnos() {
        System.out.println("Alumnos:\n");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
        System.out.println();
    }

    /**
     * Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
     * para cada alumno genera tres votos de manera aleatoria. En este método debemos
     * guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
     * votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
     * Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
     * mismo alumno. Utilizar un hashset para resolver esto.
     */
    public void votacion() {
        ArrayList<Alumno> alumnosTemporal = new ArrayList<>(listaAlumnos);
        Random random = new Random();
        for (int i = 0; i < alumnosTemporal.size(); i++) {
            Voto voto = new Voto();
            HashSet<Alumno> alumnosVotadosTemp = new HashSet<>();//3
            Alumno alumno = alumnosTemporal.get(i);
            for (int j = 0; j < 3; j++) {
                Alumno alumnoVotado = alumnosTemporal.get(random.nextInt(alumnosTemporal.size()));
                if (!alumnoVotado.equals(alumno) && !alumnosVotadosTemp.contains(alumnoVotado)) {
                    voto.setAlumno(alumno);
//                    System.out.println("Alumnos que vota:\n"+alumno);
                    alumnoVotado.setVotos(alumnoVotado.getVotos() + 1);
                    alumnosVotadosTemp.add(alumnoVotado);
//                    System.out.println("Alumnos votado:\n"+alumnoVotado);
//                    System.out.println();
                } else {
                    j--;
                }
            }
            ArrayList<Alumno> alumnosVotados = new ArrayList<>(alumnosVotadosTemp);
            voto.setListaAlumnos(alumnosVotados);
            listaVotos.add(voto);
        }
        System.out.println("Todos los alumnos votaron...\n");
    }

    public void mostrarVotos() {
        System.out.println("Lista de Votos:\n");
        for (Voto voto : listaVotos) {
            System.out.println(voto);
            System.out.println();
        }
    }

    /**
     * Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
     * comienza a hacer el recuento de votos.
     */
    public void recuentoVotos() {
        System.out.println("Recuento de votos:\n");
        for (Alumno alumno : listaAlumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto() + "\nVotos: " + alumno.getVotos());
        }
    }

    /**
     * Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
     * facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
     * los 5 facilitadores y los 5 facilitadores suplentes.
     */
    public void crearFacilitadores() {
        ArrayList<Alumno> facilitadores = new ArrayList<>(listaAlumnos);
        Comparator comparator = Comparator.comparing(Alumno::getVotos);
        Collections.sort(facilitadores, comparator.reversed());
        System.out.println("Facilitadores y Facilitadores Suplentes:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Facilitador: " + facilitadores.get(i));
        }
        System.out.println();
        for (int i = 5; i < 10; i++) {
            System.out.println("Facilitador Suplente: " + facilitadores.get(i));
        }
        System.out.println();

    }

    public void menu() {
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("--------------------");
            System.out.println("1. Crear Alumnos");
            System.out.println("2. Votar");
            System.out.println("3. Mostrar Alumnos");
            System.out.println("4. Mostrar Votos");
            System.out.println("5. Recuento de Votos");
            System.out.println("6. Crear Facilitadores");
            System.out.println("7. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();
            System.out.println("--------------------");
            switch (opcion) {
                case 1:
                    crearAlumnos();
                    break;
                case 2:
                    votacion();
                    break;
                case 3:
                    mostrarAlumnos();
                    break;
                case 4:
                    mostrarVotos();
                    break;
                case 5:
                    recuentoVotos();
                    break;
                case 6:
                    crearFacilitadores();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }
}
