package Entidades;

public class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int cantPersonasOficina;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, int numOficinas, int cantPersonasOficina, int numPisos) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasOficina = cantPersonasOficina;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonasOficina() {
        return cantPersonasOficina;
    }

    public void setCantPersonasOficina(int cantPersonasOficina) {
        this.cantPersonasOficina = cantPersonasOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie: " + ancho * alto);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen: " + alto * alto * largo);
    }

    public void cantPersonas() {
        System.out.println("Cantidad de personas por Piso: " + cantPersonasOficina * numOficinas);
        System.out.println("Cantidad de personas por Edificio: " + cantPersonasOficina * numOficinas * numPisos);
    }
}
