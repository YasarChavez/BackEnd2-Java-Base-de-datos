package Guia10Colecciones.Entidad;

/**
 * Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
 * crea métodos para agregar nuevas recetas a la lista, para buscar una
 * receta por nombre y para obtener la lista de recetas que se pueden
 * preparar con los ingredientes disponibles en la cocina.
 */
public class Receta {
    private String nombre;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;


    public Receta(String nombre, String ingrediente1, String ingrediente2, String ingrediente3) {
        this.nombre = nombre;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "nombre='" + nombre + '\'' +
                ", ingrediente1='" + ingrediente1 + '\'' +
                ", ingrediente2='" + ingrediente2 + '\'' +
                ", ingrediente3='" + ingrediente3 + '\'' +
                '}';
    }
}
