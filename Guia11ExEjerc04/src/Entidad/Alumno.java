package Entidad;

/**
 *nombre completo, DNI y cantidad de votos.
 */
public class Alumno {
    private String nombreCompleto;
    private String dni;
    private int votos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, String dni, int votos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.votos = votos;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", dni=" + dni +
                ", votos=" + votos +
                '}';
    }
}
