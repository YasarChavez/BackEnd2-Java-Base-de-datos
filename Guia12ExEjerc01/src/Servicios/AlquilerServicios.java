package Servicios;

import Entidades.Barco;

import java.util.Calendar;

public class AlquilerServicios {
    public void mostrarAlquileres(Barco barco) {
        /**
         *                  "nombre='" + nombre + '\'' +
         *                 ", documento='" + documento + '\'' +
         *                 ", fechaAlquiler=" + fechaAlquiler +
         *                 ", fechaDevolucion=" + fechaDevolucion +
         *                 ", posAmarre='" + posAmarre + '\'' +
         *                 ", barco=" + barco +
         */
        Calendar alquilerBarco = barco.getAlquiler().getFechaAlquiler();
        Calendar devolucionBarco = barco.getAlquiler().getFechaAlquiler();
        System.out.println("\n*Alquiler*");
        System.out.println("Nombre: " + barco.getAlquiler().getNombre());
        System.out.println("Documento: " + barco.getAlquiler().getDocumento());
        System.out.println("Fecha Alquiler: \n" + alquilerBarco.get(Calendar.DAY_OF_MONTH) + "/" + alquilerBarco.get(Calendar.MONTH) + "/" + alquilerBarco.get(Calendar.YEAR));
        System.out.println("Fecha Devolucion: \n" + devolucionBarco.get(Calendar.DAY_OF_MONTH) + "/" + devolucionBarco.get(Calendar.MONTH) + "/" + devolucionBarco.get(Calendar.YEAR));
        System.out.println("Posicion de Amarre: " + barco.getAlquiler().getPosAmarre());
        System.out.println("Matricula Barco: " + barco.getMatricula());
    }
}
