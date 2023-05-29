import Entidades.Circulo;
import Entidades.Rectangulo;

public class Ejerc04 {
    public static void main(String[] args) {
        /**
         * En el main se crearán las formas y se mostrará el
         * resultado final.
         */
        Rectangulo rectangulo1 = new Rectangulo(5d, 10d);
        System.out.println("Area: "+rectangulo1.calcularArea()+" Perimetro: "+rectangulo1.calcularPerimetro());
        Rectangulo rectangulo2 = new Rectangulo(10d, 5d);
        System.out.println("Area: "+rectangulo2.calcularArea()+" Perimetro: "+rectangulo2.calcularPerimetro());
        Circulo circulo1 = new Circulo(5d);
        System.out.println("Area: "+circulo1.calcularArea()+" Perimetro: "+circulo1.calcularPerimetro());
        Circulo circulo2 = new Circulo(10d);
        System.out.println("Area: "+circulo2.calcularArea()+" Perimetro: "+circulo2.calcularPerimetro());
    }
}
