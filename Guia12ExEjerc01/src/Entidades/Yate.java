package Entidades;

public class Yate extends Barco {
    private int potenciaCV;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(String matricula, double eslora, int anioFabricacion, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public void totalAlquiler() {
        long fechaA = alquiler.getFechaAlquiler().getTimeInMillis();
        long fechaD = alquiler.getFechaDevolucion().getTimeInMillis();
        long diferencia = fechaD - fechaA;
        int dias = (int) (diferencia / (1000 * 60 * 60 * 24));
        System.out.println("Total Alquiler: " + (dias * (eslora + potenciaCV + numCamarotes) * 10));
    }

    @Override
    public String toString() {
        return "Yate{" +
                "potenciaCV=" + potenciaCV +
                ", numCamarotes=" + numCamarotes +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
