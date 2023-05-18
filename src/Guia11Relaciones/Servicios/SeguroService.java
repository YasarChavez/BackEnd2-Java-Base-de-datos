package Guia11Relaciones.Servicios;

import Guia11Relaciones.Entidades.Cliente;
import Guia11Relaciones.Entidades.Poliza;
import Guia11Relaciones.Entidades.Vehiculo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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

        System.out.println("Se Crearon los Clientes");
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

        System.out.println("Se crearon los vehiculos");
    }

    public void crearSeguros() {
        Poliza pX = new Poliza();
        System.out.println("Ingrese el numero de la poliza");
        pX.setNumeroPoliza(leer.nextInt());
        System.out.println("Ingrese la fecha de inicio:");
        Calendar fechaInicio = new GregorianCalendar();
        System.out.println("Dia:");
        fechaInicio.set(Calendar.DAY_OF_MONTH, leer.nextInt());
        System.out.println("Mes:");
        fechaInicio.set(Calendar.MONTH, leer.nextInt());
        System.out.println("Año:");
        fechaInicio.set(Calendar.YEAR, leer.nextInt());
        pX.setFechaInicio(fechaInicio);
        System.out.println("Ingrese la fecha de fin:");
        Calendar fechaFin = new GregorianCalendar();
        System.out.println("Dia:");
        fechaFin.set(Calendar.DAY_OF_MONTH, leer.nextInt());
        System.out.println("Mes:");
        fechaFin.set(Calendar.MONTH, leer.nextInt());
        System.out.println("Año:");
        fechaFin.set(Calendar.YEAR, leer.nextInt());
        pX.setFechaFin(fechaFin);
        System.out.println("Ingrese la cantidad de cuotas");
        pX.setCantidadCuotas(leer.nextInt());
        System.out.println("Ingrese la forma de pago");
        pX.setFormaPago(leer.next());
        System.out.println("Ingrese el monto asegurado");
        pX.setMontoAsegurado(leer.nextDouble());
        System.out.println("Ingrese si está protegido contra granizo (true/false)");
        pX.setGranizo(leer.nextBoolean());
        System.out.println("Ingrese el monto máximo de granizo");
        pX.setMontoMaximoGranizo(leer.nextDouble());
        System.out.println("Ingrese el tipo de cobertura(Total,Parcial,Terceros,etc)");
        pX.setTipoCobertura(leer.next());


        System.out.println("Seleccione el vehiculo que desea asociar a la poliza(numero de motor)");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).toString());
        }
        double opcion = leer.nextDouble();
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getNumeroMotor() == opcion && vehiculos.get(i).getPoliza() == null) {
                pX.setVehiculo(vehiculos.get(i));
            }
        }
        System.out.println("Seleccione el cliente que desea asociar a la poliza(numero de documento)");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
        opcion = leer.nextDouble();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == opcion) {
                pX.setCliente(clientes.get(i));
                vehiculos.get(i).setPoliza(pX);
                polizas.add(pX);
            }else {
                System.out.println("Hubo un error");
            }
        }
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
            if (vehiculos.get(i).getPoliza() != null) {
                System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo()+" "+vehiculos.get(i).getPoliza().getNumeroPoliza());
            }else {
                System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo()+" Sin poliza");
            }
        }
    }
    public void gestionarCuotas(){
        System.out.println("Ingrese el numero de la poliza que desea gestionar");
        int opcion = leer.nextInt();
        for (int i = 0; i < polizas.size(); i++) {
            if (polizas.get(i).getNumeroPoliza() == opcion) {
                System.out.println("Cuotas");
                System.out.println(polizas.get(i).getCantidadCuotas());
                System.out.println("Monto total");
                System.out.println(polizas.get(i).getMontoAsegurado()/(polizas.get(i).getCantidadCuotas()));
                System.out.println("Fecha de vencimiento");
                System.out.println(polizas.get(i).getFechaFin());
                System.out.println("Forma de pago");
                System.out.println(polizas.get(i).getFormaPago());
            }
        }
    }
}
