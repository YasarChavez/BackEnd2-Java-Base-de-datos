package Entidades;

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
        long fechaA = alquiler.getFechaAlquiler().getTimeInMillis();
        long fechaD = alquiler.getFechaDevolucion().getTimeInMillis();
        long diferencia = fechaD - fechaA;
        int dias = (int) (diferencia / (1000 * 60 * 60 * 24));
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
