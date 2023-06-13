import CustomException.CustomException;
import Helper.MiHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        MiHelper helper = new MiHelper(); //Metodos y mensajes para validar password
        boolean valido = false;

        while (true){
            System.out.println("\n*Creacion de cuenta de usuario*");
            System.out.println("Ingrese un nombre de usuario:");
            String usuario = leer.next();
            System.out.println("Ingrese una contraseña:");
            String contrasena = leer.next();
            System.out.println("Confirmed su contraseña:");
            String contrasena2 = leer.next();

            try {
                helper.validarUsuario(usuario); //validar usuario
                helper.validarPassword(contrasena, contrasena2);//validar password
                valido = true;
                break;
            } catch (CustomException e) {
                System.out.println("\nHubo un problema con la creacion de la cuenta:\n" + e.getMessage());
            }

            if (valido) {
                System.out.println("\nUsuario creado correctamente!");
            }
        }
    }
}
