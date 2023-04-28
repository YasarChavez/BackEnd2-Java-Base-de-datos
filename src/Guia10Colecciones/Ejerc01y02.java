package Guia10Colecciones;
import Guia10Colecciones.Servicios.RazaService;
import java.util.ArrayList;
/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Ejerc01y02 {
    public static void main(String[] args) {
        RazaService service = new RazaService();
        ArrayList<String> razas = new ArrayList<>();
        service.crearRaza(razas);
//        System.out.println("Eliminar con while:");
//        service.eliminarRaza(razas);
        System.out.println("Eliminar con Iterator:");
        service.eliminarRazaIterator(razas);
    }
}
