package Entidades;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Barco {
    //su matrícula, su eslora en metros y año de fabricación.
    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;
    protected Alquiler alquiler;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Barco() {
    }

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void totalAlquiler() {
//        long fechaA = alquiler.getFechaAlquiler().getTimeInMillis();
//        long fechaD = alquiler.getFechaDevolucion().getTimeInMillis();
//        long diferencia = fechaD - fechaA;
//        int dias = (int) (diferencia / (1000 * 60 * 60 * 24));
        long diferencia = alquiler.getFechaDevolucion().getTimeInMillis() - alquiler.getFechaAlquiler().getTimeInMillis();
        long dias = TimeUnit.DAYS.convert(diferencia, TimeUnit.MILLISECONDS);
        System.out.println("Total Alquiler: " + (dias * eslora) * 10);
    }


    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
