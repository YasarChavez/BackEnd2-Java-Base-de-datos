import Entidad.Armadura;
import Entidad.Objeto;
import Entidad.Radar;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Armadura armadura = new Armadura();
        armadura.getRadar().mostrarObjetos();

    }
}
