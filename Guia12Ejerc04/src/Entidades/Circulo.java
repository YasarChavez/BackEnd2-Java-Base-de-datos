package Entidades;

import Interface.calculosFormas;

public class Circulo implements calculosFormas {
    protected double radio;
    protected double pi = 3.14;
    protected double area;
    protected double perimetro;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public double calcularArea() {
        this.area = pi * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = 2 * pi * radio;
        return perimetro;
    }
}
