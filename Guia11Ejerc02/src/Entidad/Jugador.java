package Entidad;

/**
 * Clase Entidad.Jugador: esta clase posee los siguientes atributos: id (representa el número del
 * jugador), nombre (Empezara con Entidad.Jugador más su ID, “Entidad.Jugador 1” por ejemplo) y mojado (indica
 * si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
 * debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Entidad.Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mojado=" + mojado +
                '}';
    }


}
