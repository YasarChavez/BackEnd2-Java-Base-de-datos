import Entidad.Persona;
import Enumeradores.SexoEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona  persona = new Persona();
        persona.crearPersona();
        System.out.println(persona);
    }
}
