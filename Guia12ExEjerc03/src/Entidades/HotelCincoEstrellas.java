package Entidades;

public class HotelCincoEstrellas extends HotelCuatroEstrellas {
    //Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    //Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
    //Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

    protected int cantidadSalonesConferencia;
    protected int cantidadSuites;
    protected int cantidadLimosinas;


    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(String tipoGimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas) {
        super(tipoGimnasio, nombreRestaurante, capacidadRestaurante);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public HotelCincoEstrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, String tipoGimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, tipoGimnasio, nombreRestaurante, capacidadRestaurante);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public String toString() {
        return "HotelCincoEstrellas{" +
                "cantidadSalonesConferencia=" + cantidadSalonesConferencia +
                ", cantidadSuites=" + cantidadSuites +
                ", cantidadLimosinas=" + cantidadLimosinas +
                ", tipoGimnasio='" + tipoGimnasio + '\'' +
                ", nombreRestaurante='" + nombreRestaurante + '\'' +
                ", capacidadRestaurante=" + capacidadRestaurante +
                ", cantidadHabitaciones=" + cantidadHabitaciones +
                ", numeroCamas=" + numeroCamas +
                ", cantidadPisos=" + cantidadPisos +
                ", precioHabitaciones=" + precioHabitaciones +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }

    public HotelCincoEstrellas crearHotelCincoEstrellas() {
        System.out.println("*Creando Hotel Cinco Estrellas*");
        System.out.println("Nombre del Hotel:");
        this.nombre = leer.next();
        System.out.println("Dirección del Hotel:");
        this.direccion = leer.next();
        System.out.println("Localidad del Hotel:");
        this.localidad = leer.next();
        System.out.println("Gerente del Hotel:");
        this.gerente = leer.next();
        System.out.println("Cantidad de Habitaciones:");
        this.cantidadHabitaciones = leer.nextInt();
        System.out.println("Número de Camas:");
        this.numeroCamas = leer.nextInt();
        System.out.println("Cantidad de Pisos:");
        this.cantidadPisos = leer.nextInt();
        System.out.println("Precio de las Habitaciones:");
        this.precioHabitaciones = leer.nextDouble();
        System.out.println("Tipo de Gimnasio: A/B");
        this.tipoGimnasio = leer.next().toUpperCase();
        System.out.println("Nombre del Restaurante:");
        this.nombreRestaurante = leer.next();
        System.out.println("Capacidad del Restaurante:");
        this.capacidadRestaurante = leer.nextInt();
        System.out.println("Cantidad Salones de Conferencia:");
        this.cantidadSalonesConferencia = leer.nextInt();
        System.out.println("Cantidad Suites:");
        this.cantidadSuites = leer.nextInt();
        System.out.println("Cantidad Limosinas:");
        this.cantidadLimosinas = leer.nextInt();
        calcularPrecioHabitacion();
        return this;
    }

    @Override
    public void calcularPrecioHabitacion() {
        super.calcularPrecioHabitacion();
        this.precioHabitaciones = +(15 * this.cantidadLimosinas);
    }
}
