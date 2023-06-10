import Entidad.Objeto;
import Entidad.Radar;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Radar radar = new Radar();
        radar.crearEnemigos();
        radar.mostrarObjetos(radar.getEnemigos());
    }
}
