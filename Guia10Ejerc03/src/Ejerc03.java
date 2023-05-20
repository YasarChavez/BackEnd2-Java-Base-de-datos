import Entidad.Alumno;
import Servicio.AlumnoService;

import java.util.ArrayList;

/**
 * Crear una clase llamada Entidades.Alumno que mantenga información sobre las notas de distintos
 * alumnos. La clase Entidades.Alumno tendrá como atributos, su nombre y una lista de tipo Integer
 * con sus 3 notas.
 * En el servicio de Entidades.Alumno deberemos tener un bucle que crea un objeto Entidades.Alumno. Se pide
 * toda la información al usuario y ese Entidades.Alumno se guarda en una lista de tipo Entidades.Alumno y se le
 * pregunta al usuario si quiere crear otro Entidades.Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Entidades.Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
 * final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
 * del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main.
 */
public class Ejerc03 {
    public static void main(String[] args) {
        AlumnoService service = new AlumnoService();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        service.crearAlumnos(alumnos);
        service.mostrarAlumnos(alumnos);
        service.notaFinal(alumnos);
        service.eliminarAlumno(alumnos);
        service.mostrarAlumnos(alumnos);
        service.modificarAlumno(alumnos);
        service.mostrarAlumnos(alumnos);

    }
}
