package Guia11Relaciones.Entidades;

import java.util.Arrays;

public class SalaCine {
    private Butaca[][] butacas;
    private String[] filas;
    private String[] columnas;
    private Pelicula pelicula;

    public SalaCine() {
    }

    public SalaCine(Butaca[][] butacas, String[] filas, String[] columnas) {
        this.butacas = butacas;
        this.filas = filas;
        this.columnas = columnas;
    }

    public Butaca[][] getButacas() {
        return butacas;
    }

    public void setButacas(Butaca[][] butacas) {
        this.butacas = butacas;
    }

    public String[] getFilas() {
        return filas;
    }

    public void setFilas(String[] filas) {
        this.filas = filas;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "SalaCine{" +
                "butacas=" + Arrays.toString(butacas) +
                ", filas=" + Arrays.toString(filas) +
                ", columnas=" + Arrays.toString(columnas) +
                ", pelicula=" + pelicula +
                '}';
    }
}
