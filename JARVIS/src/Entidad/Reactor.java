package Entidad;

public class Reactor {
    private float cargaReactor = 10000f;

    public Reactor() {
    }

    public Reactor(float cargaReactor) {
        this.cargaReactor = cargaReactor;
    }

    public float getCargaReactor() {
        return cargaReactor;
    }

    public void setCargaReactor(float cargaReactor) {
        this.cargaReactor = cargaReactor;
    }

    @Override
    public String toString() {
        return "Reactor{" +
                "cargaReactor=" + cargaReactor +
                '}';
    }
}
