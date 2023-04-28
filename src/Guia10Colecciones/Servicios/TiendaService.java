package Guia10Colecciones.Servicios;

import Guia10Colecciones.Entidad.Productos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
public class TiendaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void agregarProducto(HashMap<String, Double> productos){
        Productos producto = new Productos();
        System.out.println("Ingrese el nombre del producto");
        producto.setNombre(leer.next());
        System.out.println("Ingrese el precio del producto");
        producto.setPrecio(leer.nextDouble());
        productos.put(producto.getNombre(),producto.getPrecio());
    }
    public void modificarProducto(HashMap<String, Double> productos){
        System.out.println("Ingrese el nombre del producto que desea modificar");
        String nombre = leer.next();
        System.out.println("Ingrese el nuevo precio del producto");
        Double precio = leer.nextDouble();
        if (productos.containsKey(nombre)){
            productos.put(nombre,precio);
        }
        mostrarProductos(productos);
    }
    public void eliminarProducto(HashMap<String, Double> productos){
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String nombre = leer.next();
        if (productos.containsKey(nombre)){
            productos.remove(nombre);
        }
        mostrarProductos(productos);
    }
    public void mostrarProductos(HashMap<String, Double> productos){
        ArrayList<String> lista = new ArrayList<>(productos.keySet());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)+" "+productos.get(lista.get(i)));
        }
    }
}
