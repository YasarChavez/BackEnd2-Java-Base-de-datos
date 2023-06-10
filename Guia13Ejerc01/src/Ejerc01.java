import Entidad.Persona;
import ExcepcionesPersona.ExceptionsPersona;
import Servicio.PersonaServicio;

public class Ejerc01 {
    public static void main(String[] args) throws ExceptionsPersona {
        /**
         * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
         * de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
         * con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
         */
        PersonaServicio personaServicio = new PersonaServicio();
//        Persona persona = null;
//        try {
//            personaServicio.esMayorDeEdad(persona);
//
//        }catch (Exception e){
////        }catch (NullPointerException e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("***");
//        }
        try {
            personaServicio.crearPersona("Juan",9);
        }catch (ExceptionsPersona e){
            System.out.println(e.getMessage());
        }
        }
    }


