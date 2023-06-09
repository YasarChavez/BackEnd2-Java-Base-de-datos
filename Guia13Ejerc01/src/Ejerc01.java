import Entidad.Persona;
import Servicio.PersonaServicio;

public class Ejerc01 {
    public static void main(String[] args)  {
        /**
         * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
         * de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
         * con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
         */
        PersonaServicio personaServicio = new PersonaServicio();
        Persona persona = null;
        try {
            personaServicio.esMayorDeEdad(persona);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("***");
        }
    }
}
