package Guia10Colecciones.Servicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
 * y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
 * introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
 * programa mostrará por pantalla el número de valores que se han leído, su suma y su
 * media (promedio).
 */
public class NumerosService {
    Scanner leer = new Scanner(System.in);
    ArrayList<Integer> listaNumeros = new ArrayList();

    public void agregarNumero(){
        System.out.println("Ingrese una lista de numeros(-99 para terminar)");
        int numero = leer.nextInt();
        while (numero != -99){
            listaNumeros.add(numero);
            numero = leer.nextInt();
        }
    }

    public void mostrarNumeros(){
        System.out.println("La lista de numeros es: " + listaNumeros);
    }
    public void mostrarSuma(){
        int suma = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            suma += listaNumeros.get(i);
        }
        System.out.println("La suma de los numeros es: " + suma);
    }
    public void mostrarMedia(){
        int suma = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            suma += listaNumeros.get(i);
        }
        System.out.println("La media de los numeros es: " + suma/listaNumeros.size());
    }

}
