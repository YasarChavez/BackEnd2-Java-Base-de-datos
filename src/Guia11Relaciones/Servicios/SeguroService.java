package Guia11Relaciones.Servicios;

import Guia11Relaciones.Entidades.Cliente;
import Guia11Relaciones.Entidades.Poliza;
import Guia11Relaciones.Entidades.Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class SeguroService {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    ArrayList<Poliza> polizas = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public void cargarClientes() {
        Cliente c1 = new Cliente();
        c1.setNombre("Juan");
        c1.setApellido("Perez");
        c1.setDocumento(123);
        c1.setDomicilio("Av. Siempreviva 123");
        c1.setTelefono("123123");
        c1.setMail("XXXXXXXXXXXXXX");
        clientes.add(c1);
        Cliente c2 = new Cliente();
        c2.setNombre("Pedro");
        c2.setApellido("Gomez");
        c2.setDocumento(456);
        c2.setDomicilio("Av. Siempreviva 456");
        c2.setTelefono("456123");
        c2.setMail("XXXXXXXXXXXXXX");
        clientes.add(c2);
    }
    public void cargarVehiculos() {
        Vehiculo v1 = new Vehiculo();
        v1.setMarca("Ford");
        v1.setModelo("Fiesta");
        v1.setAnio(2020);
        v1.setNumeroMotor(123123);
        v1.setChasis("123123");
        v1.setColor("Azul");
        v1.setTipo("Auto");
        vehiculos.add(v1);
        Vehiculo v2 = new Vehiculo();
        v2.setMarca("Ford");
        v2.setModelo("Focus");
        v2.setAnio(2023);
        v2.setNumeroMotor(159753);
        v2.setChasis("159753");
        v2.setColor("Negro");
        v2.setTipo("Auto");
        vehiculos.add(v2);
    }

    public void crearSeguros() {
        Poliza p1 = new Poliza();
        p1.setNumeroPoliza(1);
        p1.setFechaInicio("01/01/2020");
        p1.setFechaFin("31/12/2020");
        p1.setCantidadCuotas(12);
        p1.setFormaPago("Efectivo");
        p1.setMontoAsegurado(10000);
        p1.setGranizo(true);
        p1.setMontoMaximoGranizo(1000);
        p1.setTipoCobertura("Completa");
        System.out.println("Seleccione el vehiculo que desea asociar a la poliza(numero de motor)");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).toString());
        }
        double opcion = leer.nextDouble();
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getNumeroMotor() == opcion) {
                p1.setVehiculo(vehiculos.get(i));
            }
        }
        System.out.println("Seleccione el cliente que desea asociar a la poliza(numero de documento)");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
        opcion = leer.nextDouble();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == opcion) {
                p1.setCliente(clientes.get(i));
            }
        }
        polizas.add(p1);

        Poliza p2 = new Poliza();
        p2.setNumeroPoliza(2);
        p2.setFechaInicio("01/01/2020");
        p2.setFechaFin("31/12/2020");
        p2.setCantidadCuotas(12);
        p2.setFormaPago("Efectivo");
        p2.setMontoAsegurado(10000);
        p2.setGranizo(true);
        p2.setMontoMaximoGranizo(1000);
        p2.setTipoCobertura("Contra Terceros");
        System.out.println("Seleccione el vehiculo que desea asociar a la poliza(numero de motor)");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).toString());
        }
        opcion = leer.nextDouble();
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getNumeroMotor() == opcion) {
                p2.setVehiculo(vehiculos.get(i));
            }
        }
        System.out.println("Seleccione el cliente que desea asociar a la poliza(numero de documento)");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
        opcion = leer.nextDouble();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == opcion) {
                p2.setCliente(clientes.get(i));
            }
        }
        polizas.add(p2);
    }

    public void mostrarSeguros() {
        for (int i = 0; i < polizas.size(); i++) {
            System.out.println(polizas.get(i).getCliente().getNombre() + " " + polizas.get(i).getCliente().getApellido() + " " + polizas.get(i).getVehiculo().getMarca() + " " + polizas.get(i).getVehiculo().getModelo());
        }
    }

    public void mostrarClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).getNombre() + " " + clientes.get(i).getApellido());
        }
    }

    public void mostrarVehiculos() {
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
        }
    }
}
