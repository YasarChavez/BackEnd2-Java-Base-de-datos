import Entidades.Lavadora;
import Entidades.Televisor;

public class Ejerc02 {
    public static void main(String[] args) {
        Lavadora lavadoraObj = new Lavadora();
        lavadoraObj.crearLavadora();
        System.out.println(lavadoraObj);
        Televisor televisorObj = new Televisor();
        televisorObj.crearTelevisor();
        System.out.println(televisorObj);
    }
}
