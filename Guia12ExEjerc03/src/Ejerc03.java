import Entidades.*;
import Service.AlojamientoService;

import java.util.ArrayList;

public class Ejerc03 {
    public static void main(String[] args) {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        HotelCuatroEstrellas hotel4 = new HotelCuatroEstrellas("Hotel 4 Estrellas", "Calle Falsa 123", "Santa Fe", "Juanito", 2, 2, 3, 50, "A", "Restaurante 4 Estrellas", 20);
        HotelCincoEstrellas Hotel5 = new HotelCincoEstrellas("Hotel 5 Estrellas", "Calle Falsa 321", "Santa Fe", "Pedrito", 5, 2, 5, 50, "A", "Restaurante 4 Estrellas", 40, 2, 3, 10);
        hotel4.calcularPrecioHabitacion();
        Hotel5.calcularPrecioHabitacion();
        alojamientos.add(hotel4);
        alojamientos.add(Hotel5);
        Camping camping1 = new Camping("Camping 1", "Calle Falsa 321", "Santa Fe", "Lorencio", 100, 20, true);
        Camping camping2 = new Camping("Camping 2", "Calle Falsa 152", "Santa Fe", "Nanito", 50, 15, false);
        alojamientos.add(camping1);
        alojamientos.add(camping2);
        Residencia residencia1 = new Residencia("Residencia 1", "Calle Falsa 789", "Santa Fe", "Anastacio", 5, true, false);
        Residencia residencia2 = new Residencia("Residencia 2", "Calle Falsa 789", "Santa Fe", "Anastacio", 5, false, true);
        alojamientos.add(residencia1);
        alojamientos.add(residencia2);

        AlojamientoService alojamientoService = new AlojamientoService();
        alojamientoService.menu(alojamientos);
        //DONE
    }
}
