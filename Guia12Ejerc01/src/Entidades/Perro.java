package Entidades;

public class Perro extends Animal {
    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getAlimento() {
        return super.getAlimento();
    }

    @Override
    public void setAlimento(String alimento) {
        super.setAlimento(alimento);
    }

    @Override
    public Integer getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(Integer edad) {
        super.setEdad(edad);
    }

    @Override
    public String getRaza() {
        return super.getRaza();
    }

    @Override
    public void setRaza(String raza) {
        super.setRaza(raza);
    }

    @Override
    public void alimentarse() {
//        super.alimentarse();
        System.out.println(this.nombre + " se alimenta de " + this.alimento);
    }
}
