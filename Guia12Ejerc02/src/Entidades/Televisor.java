package Entidades;

public class Televisor extends Electrodomestico {
    protected int pulgadas;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(Double precio, String color, Character consumoEnergetico, Double peso, int pulgadas, boolean tdt) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        pulgadas = leer.nextInt();
        System.out.println("Ingrese si tiene TDT (true/false)");
        tdt = leer.nextBoolean();
        precioFinal();
    }

    public void precioFinal() {
        super.precioFinal();
        if (pulgadas > 40) {
            precio += precio * 0.3;
        }
        if (tdt) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "pulgadas=" + pulgadas +
                ", tdt=" + tdt +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
