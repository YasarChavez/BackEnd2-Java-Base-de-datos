package Entidad;

/**
 * Realizar un programa para que una Entidad.Persona pueda adoptar un Entidad.Perro. Vamos a contar de dos
 * clases. Entidad.Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Entidad.Persona con
 * atributos: nombre, apellido, edad, documento y Entidad.Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 * pensar la lógica necesaria para asignarle a cada Entidad.Persona un Entidad.Perro y por ultimo, mostrar desde
 * la clase Entidad.Persona, la información del Entidad.Perro y de la Entidad.Persona.
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamaño) {
        this.tamano = tamaño;
    }

    @Override
    public String toString() {
        return "Entidad.Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamaño='" + tamano + '\'' +
                '}';
    }
}
