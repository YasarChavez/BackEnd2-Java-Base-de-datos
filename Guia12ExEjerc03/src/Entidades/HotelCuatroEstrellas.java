package Entidades;

public class HotelCuatroEstrellas extends Hotel {
    //Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    //Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
    protected String tipoGimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;


    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(String tipoGimnasio, String nombreRestaurante, int capacidadRestaurante) {
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public HotelCuatroEstrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, String tipoGimnasio, String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones);
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(String tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "HotelCuatroEstrellas{" +
                "tipoGimnasio='" + tipoGimnasio + '\'' +
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

    public HotelCuatroEstrellas crearHotelCuatroEstrellas() {
        System.out.println("*Creando Hotel Cuatro Estrellas*");
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
        calcularPrecioHabitacion();
        return this;
    }

    public void calcularPrecioHabitacion() {
        /**
         * El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
         * PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante)
         * + (valor agregado por gimnasio) + (valor agregado por limosinas).
         * Valor agregado por el restaurante:
         * • $10 si la capacidad del restaurante es de menos de 30 personas.
         * • $30 si está entre 30 y 50 personas.
         * • $50 si es mayor de 50.
         * Valor agregado por el gimnasio:
         * • $50 si el tipo del gimnasio es A.
         * • $30 si el tipo del gimnasio es B.
         */
        double agregadoRestaurante = 0;
        if (capacidadRestaurante < 30) {
            agregadoRestaurante = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            agregadoRestaurante = 30;
        } else {
            agregadoRestaurante = 50;
        }
        this.precioHabitaciones = (this.cantidadHabitaciones * this.numeroCamas * this.cantidadPisos) + agregadoRestaurante;
        if (tipoGimnasio.equals("A")) {
            this.precioHabitaciones += 50;
        } else if (tipoGimnasio.equals("B")) {
            this.precioHabitaciones += 30;
        }
    }
}
