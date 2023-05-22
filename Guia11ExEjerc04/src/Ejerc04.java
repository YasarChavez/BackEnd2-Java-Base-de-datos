import Enums.ApellidosEnum;
import Enums.NombresEnum;
import Servicio.SimuladorService;

import java.util.ArrayList;
import java.util.Random;

public class Ejerc04 {
    public static void main(String[] args) {
        SimuladorService simuladorService = new SimuladorService();
        simuladorService.crearAlumnos();
        simuladorService.mostrarAlumnos();
    }
}
