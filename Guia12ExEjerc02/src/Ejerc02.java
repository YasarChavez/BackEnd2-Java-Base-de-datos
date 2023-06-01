import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;

import java.util.ArrayList;

public class Ejerc02 {
    public static void main(String[] args) {
        ArrayList<Edificio> edificioArrayList = new ArrayList<>();
        Polideportivo polideportivo1 = new Polideportivo(20, 3, 30, true);
        Polideportivo polideportivo2 = new Polideportivo(20, 3, 30, false);
        EdificioDeOficinas edificioDeOficinas1 = new EdificioDeOficinas(10, 15, 10, 3, 5, 5);
        EdificioDeOficinas edificioDeOficinas2 = new EdificioDeOficinas(20, 3, 15, 5, 5, 5);

        edificioArrayList.add(polideportivo1);
        edificioArrayList.add(polideportivo2);
        edificioArrayList.add(edificioDeOficinas1);
        edificioArrayList.add(edificioDeOficinas2);

        for (Edificio aux : edificioArrayList) {
            if (aux instanceof Polideportivo) {
                System.out.println("Polideportivo:");
                aux.calcularSuperficie();
                aux.calcularVolumen();
                if (((Polideportivo) aux).isTechado()) {
                    System.out.println("Techado.");
                } else {
                    System.out.println("No Techado.");
                }
            }
            System.out.println();
            if (aux instanceof EdificioDeOficinas) {
                System.out.println("Edificio De Oficinas:");
                aux.calcularSuperficie();
                aux.calcularVolumen();
                ((EdificioDeOficinas) aux).cantPersonas();
            }
        }
    //Done
    }
}
