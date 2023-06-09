import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejerc05 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(500) + 1;
        System.out.println("NumeroSecreto "+ numeroAdivinar);
        int intentos = 0;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Intenta adivinar un número entre 1 y 500.");

        while (true) {
            System.out.print("\nIntroduce tu número: ");
            try {
                int numeroUsuario = leer.nextInt();
                intentos++;
                if (numeroUsuario==numeroAdivinar){
                    System.out.println("Adivinaste!!");
                    System.out.println("Cantidad de intentos: "+ intentos);
                    break;
                }else{
                    System.out.println("No adivinaste T.T");
                }
            }catch (InputMismatchException e){
                System.out.println("Eso no es un numero!\nIntenta nuevamente!");
                intentos++;
                leer.next();
            }
        }
    }
}
