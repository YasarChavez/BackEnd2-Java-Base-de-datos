package Servicio;

import Entidad.Cliente;
import Entidad.Poliza;
import Entidad.Vehiculo;
import Enums.ApellidosEnum;
import Enums.NombresEnum;

import java.util.*;

public class SeguroService {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    ArrayList<Poliza> polizas = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //TODO : Cargar clientes y vehiculos
    public void cargarClientes() {
        Random random = new Random();
        Cliente c1 = new Cliente();
        //Asignar nombre y apellido con enum
        NombresEnum nombreEnum = NombresEnum.values()[random.nextInt(NombresEnum.values().length)];
        ApellidosEnum apellidoEnum = ApellidosEnum.values()[random.nextInt(ApellidosEnum.values().length)];
        c1.setNombre(String.valueOf(nombreEnum));
        c1.setApellido(String.valueOf(apellidoEnum));
        double documento = random.nextInt(999999) + 100000;
        double telefono = random.nextInt(999999) + 100000;
        double numCalle = random.nextInt(999) + 100;
        c1.setDocumento(documento);
        c1.setDomicilio("Av. Siempreviva " + String.valueOf(numCalle));
        c1.setTelefono(String.valueOf(telefono));
        c1.setMail("XXXXXXXXXXXXXX");
        ArrayList<Poliza> polizasCliente = new ArrayList<>();
        c1.setPolizaArrayList(polizasCliente);
        ArrayList<Vehiculo> vehiculosCliente = new ArrayList<>();
        c1.setVehiculoArrayList(vehiculosCliente);
        clientes.add(c1);
        System.out.println("Cliente creado");
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


        System.out.println("Seleccione el vehiculo que desea asociar a la poliza: (numero de motor)");
        for (int i = 0; i < vehiculos.size(); i++) {
            //Detalles del vehiculo
            System.out.println("Marca: " + vehiculos.get(i).getMarca());
            System.out.println("Modelo: " + vehiculos.get(i).getModelo());
            System.out.println("Año: " + vehiculos.get(i).getAnio());
            System.out.println("Numero Motor: " + vehiculos.get(i).getNumeroMotor());
            System.out.println();
        }
        double opcion = leer.nextDouble();
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getNumeroMotor() == opcion && vehiculos.get(i).getPoliza() == null) {
                pX.setVehiculo(vehiculos.get(i));
            }
        }
        System.out.println("Seleccione el cliente que desea asociar a la poliza: (numero de documento)");
        for (int i = 0; i < clientes.size(); i++) {
            //Detalles del cliente
            System.out.println("Nombre: " + clientes.get(i).getNombre());
            System.out.println("Apellido: " + clientes.get(i).getApellido());
            System.out.println("Documento: " + clientes.get(i).getDocumento());
            System.out.println();
        }
        opcion = leer.nextDouble();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == opcion) {
                pX.setCliente(clientes.get(i));
                vehiculos.get(i).setPoliza(pX);
                vehiculos.get(i).setCliente(clientes.get(i));
                ArrayList<Vehiculo> vehiculosCliente = clientes.get(i).getVehiculoArrayList();
                vehiculosCliente.add(vehiculos.get(i));
                ArrayList<Poliza> polizasCliente = clientes.get(i).getPolizaArrayList();
                polizasCliente.add(pX);
                polizas.add(pX);
            }
        }
    }

    public void mostrarSeguros() {
        if (polizas.isEmpty()) {
            System.out.println("No hay seguros cargados");
        } else {
            System.out.println("Polizas cargadas:");
            for (int i = 0; i < polizas.size(); i++) {
                System.out.println(
                        "Nombre Cliente: " + polizas.get(i).getCliente().getNombre()
                                + "\nApellido Cliente: " + polizas.get(i).getCliente().getApellido()
                                + "\nVehiculo: " + polizas.get(i).getVehiculo().getMarca()
                                + "\nModelo: " + polizas.get(i).getVehiculo().getModelo()
                                + "\nNumero Motor:" + vehiculos.get(i).getNumeroMotor()
                                + "\nNumero Poliza:" + polizas.get(i).getNumeroPoliza()
                                + "\nFecha Inicio:" + polizas.get(i).getFechaInicio().get(Calendar.YEAR) + "/" + polizas.get(i).getFechaInicio().get(Calendar.MONTH) + "/" + polizas.get(i).getFechaInicio().get(Calendar.DAY_OF_MONTH)
                                + "\nFecha Fin:" + polizas.get(i).getFechaFin().get(Calendar.YEAR) + "/" + polizas.get(i).getFechaFin().get(Calendar.MONTH) + "/" + polizas.get(i).getFechaFin().get(Calendar.DAY_OF_MONTH)
                );
            }
        }
    }

    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes cargados");
        } else {
            System.out.println("Clientes:");
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println(
                        "Nombre: " + clientes.get(i).getNombre()
                                + "\nApellido: " + clientes.get(i).getApellido()
                                + "\nDocumento: " + clientes.get(i).getDocumento()
                                + "\nDireccion: " + clientes.get(i).getDomicilio()
                                + "\nTelefono: " + clientes.get(i).getTelefono()
                );
                System.out.println(
                        "Polizas: " + clientes.get(i).getPolizaArrayList()
                                + "\nVehiculos: " + clientes.get(i).getVehiculoArrayList()
                                + "\n------------------------------------"
                );
            }
        }
    }

    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos cargados");
        } else {
            System.out.println("Vehiculos:");
            for (int i = 0; i < vehiculos.size(); i++) {
                if (vehiculos.get(i).getPoliza() != null && vehiculos.get(i).getCliente() != null) {
                    System.out.println(
                            "Marca: " + vehiculos.get(i).getMarca()
                                    + "\nModelo: " + vehiculos.get(i).getModelo()
                                    + "\nNumero Motor: " + vehiculos.get(i).getNumeroMotor()
                                    + "\nPoliza: " + vehiculos.get(i).getPoliza().getNumeroPoliza()
                                    + "\nDueño: " + vehiculos.get(i).getPoliza().getCliente().getNombre()
                                    + "\n"
                    );
                } else {
                    System.out.println(
                            "Marca: " + vehiculos.get(i).getMarca()
                                    + "\nModelo: " + vehiculos.get(i).getModelo()
                                    + "\nNumero Motor: " + vehiculos.get(i).getNumeroMotor()
                                    + " Sin Dueño / Sin poliza Asignados!" + "\n"
                    );
                }
            }
        }
    }

    public void gestionarCuotas() {
        System.out.println("Fecha Actual:");
        Calendar fechaActual = new GregorianCalendar();
        System.out.println(fechaActual.get(Calendar.YEAR) + "/" + (fechaActual.get(Calendar.MONTH) + 1) + "/" + fechaActual.get(Calendar.DAY_OF_MONTH));
        System.out.println("Desea registrar un pago o gestionar las cuotas? (1.Pago / 2.Gestionar)");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese el numero de la poliza que desea gestionar");
            int opcion2 = leer.nextInt();
            for (int i = 0; i < polizas.size(); i++) {
                if (polizas.get(i).getNumeroPoliza() == opcion2) {
                    System.out.println("Debe pagar: " + polizas.get(i).getMontoAsegurado() / (polizas.get(i).getCantidadCuotas()));
                    System.out.println("Ingrese el monto del pago");
                    double monto = leer.nextDouble();
                    if (monto >= polizas.get(i).getMontoAsegurado() / (polizas.get(i).getCantidadCuotas())) {
                        System.out.println("Pago exitoso");
                        polizas.get(i).setPagada(true);
                    } else {
                        System.out.println("Pago fallido");
                        polizas.get(i).setPagada(false);
                    }
                }
            }
        } else if (opcion == 2) {
            System.out.println("Ingrese el numero de la poliza que desea gestionar");
            int opcion3 = leer.nextInt();
            for (int i = 0; i < polizas.size(); i++) {
                if (polizas.get(i).getNumeroPoliza() == opcion3) {
                    System.out.println("Cuotas");
                    System.out.println(polizas.get(i).getCantidadCuotas());
                    System.out.println("Monto total");
                    System.out.println(polizas.get(i).getMontoAsegurado() / (polizas.get(i).getCantidadCuotas()));
                    System.out.println("Fecha de vencimiento");
                    System.out.println(polizas.get(i).getFechaFin().get(Calendar.YEAR) + "/" + polizas.get(i).getFechaFin().get(Calendar.MONTH) + "/" + polizas.get(i).getFechaFin().get(Calendar.DAY_OF_MONTH) + 1);
                    System.out.println("Forma de pago");
                    System.out.println(polizas.get(i).getFormaPago());
                    System.out.println("Pagada:");
                    System.out.println(polizas.get(i).isPagada());
                }
            }
        }
    }
}
