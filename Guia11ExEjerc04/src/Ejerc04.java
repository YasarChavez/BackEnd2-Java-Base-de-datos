import Servicio.SimuladorService;

public class Ejerc04 {
    public static void main(String[] args) {
        SimuladorService simuladorService = new SimuladorService();
        simuladorService.crearAlumnos();
        simuladorService.mostrarAlumnos();
        simuladorService.votacion();
        simuladorService.mostrarVotos();
    }
}
