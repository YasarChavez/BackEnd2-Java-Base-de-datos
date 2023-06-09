import java.util.ArrayList;

public class Ejerc02 {
    public static void main(String[] args) {
        /**
         * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
         * generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
         * de rango).
         */
        int[] numeros = new int[5];
        try {
            System.out.println(numeros[10]);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        } finally {
            System.out.println("***");
        }
    }
}
