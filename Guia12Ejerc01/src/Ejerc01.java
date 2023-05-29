import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import Servicios.AnimalesService;

import java.util.ArrayList;

public class Ejerc01 {
    public static void main(String[] args) {
        AnimalesService animalesService = new AnimalesService();
        ArrayList<Animal> animales = new ArrayList<>();

        Animal perroObj = new Perro("Firulais", "Carne", 7, "Pitbull");
        animales.add(perroObj);
        perroObj.alimentarse();

        Animal gatoObj = new Gato("Pelusa", "Croquetas", 5, "Siames");
        animales.add(gatoObj);
        gatoObj.alimentarse();

        Animal caballoObj = new Caballo("Pegaso", "Alfalfa", 10, "Caballo andaluz");
        animales.add(caballoObj);
        caballoObj.alimentarse();

        System.out.println("\nTipo de animal: ");
        animalesService.mostrarTipo(animales);
    }
}
