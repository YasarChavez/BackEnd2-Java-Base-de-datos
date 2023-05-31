package Entidades;

public class Polideportivo extends Edificio{
    private boolean techado;


    public Polideportivo() {

    }

    public Polideportivo(double ancho, double alto, double largo, boolean techado) {
        super(ancho, alto, largo);
        this.techado = techado;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie: "+ancho*alto);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen: "+alto*alto*largo);
    }
}
