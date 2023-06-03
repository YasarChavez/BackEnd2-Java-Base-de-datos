package Entidades;

import java.util.concurrent.TimeUnit;

public class Velero extends Barco {
    private int numMastiles;

    public Velero() {

    }

    public Velero(String matricula, double eslora, int anioFabricacion, int numMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }


    @Override
    public void totalAlquiler() {
        long diferencia = alquiler.getFechaDevolucion().getTimeInMillis() - alquiler.getFechaAlquiler().getTimeInMillis();
        long dias = TimeUnit.DAYS.convert(diferencia, TimeUnit.MILLISECONDS);
        System.out.println("Total Alquiler: " + (dias * (eslora + numMastiles) * 10));
    }

    @Override
    public String toString() {
        return "Velero{" +
                "numMastiles=" + numMastiles +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
