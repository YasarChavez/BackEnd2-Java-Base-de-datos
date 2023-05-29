import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

import java.util.ArrayList;

public class Ejerc02 {
    public static void main(String[] args) {
        //Parte Ejerc 02
//        Lavadora lavadoraObj = new Lavadora();
//        lavadoraObj.crearLavadora();
//        System.out.println(lavadoraObj);
//        Televisor televisorObj = new Televisor();
//        televisorObj.crearTelevisor();
//        System.out.println(televisorObj);

        //Parte Ejerc 03
        ArrayList<Electrodomestico> electrodomesticoArrayList = new ArrayList<>();
        Lavadora lavadora1 = new Lavadora(1000d, "Blanco", 'A', 80d, 15);
        Lavadora lavadora2 = new Lavadora(1500d, "Negro", 'F', 60d, 10);
        Televisor televisor1 = new Televisor(500d, "Gris", 'B', 15d, 32, true);
        Televisor televisor2 = new Televisor(500d, "Negro", 'C', 10d, 24, false);
        electrodomesticoArrayList.add(lavadora1);
        electrodomesticoArrayList.add(lavadora2);
        electrodomesticoArrayList.add(televisor1);
        electrodomesticoArrayList.add(televisor2);

        double lavadoras = 0;
        double televisores = 0;
        for (Electrodomestico electrodomesticoobj : electrodomesticoArrayList) {
            electrodomesticoobj.precioFinal();
            if (electrodomesticoobj instanceof Lavadora) {
                System.out.println("Lavadora: "+ electrodomesticoobj.getPrecio());
                lavadoras += electrodomesticoobj.getPrecio();
            }
            if (electrodomesticoobj instanceof Televisor) {
                System.out.println("Televisor: "+electrodomesticoobj.getPrecio());
                televisores += electrodomesticoobj.getPrecio();
            }
        }
        String totales1 = String.format("Total lavadoras: %.2f", lavadoras);
        String totales2 = String.format("Total televisores: %.2f", televisores);
        System.out.println(totales1);
        System.out.println(totales2);
        System.out.println("Total: "+(lavadoras+televisores));

    }
}
