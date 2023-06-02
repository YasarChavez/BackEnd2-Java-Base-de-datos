package Entidades;

import java.util.concurrent.TimeUnit;

public class BarcosaMotor extends Barco {
    protected int potenciaCV;

    public BarcosaMotor() {
    }

    public BarcosaMotor(String matricula, double eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public void totalAlquiler() {
        long diferencia = alquiler.getFechaDevolucion().getTimeInMillis()-alquiler.getFechaAlquiler().getTimeInMillis();
        long dias = TimeUnit.DAYS.convert(diferencia,TimeUnit.MILLISECONDS);
        System.out.println("Total Alquiler: " + (dias * (eslora + potenciaCV) * 10));
    }

    @Override
    public String toString() {
        return "BarcosaMotor{" +
                "potenciaCV=" + potenciaCV +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
