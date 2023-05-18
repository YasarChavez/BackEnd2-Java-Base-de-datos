package Guia11Relaciones.Servicios;

import Guia11Relaciones.Entidades.Clientes;
import Guia11Relaciones.Entidades.Polizas;
import Guia11Relaciones.Entidades.Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class SeguroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Clientes> clientes = new ArrayList<>();
    ArrayList<Polizas> polizas = new ArrayList<>();
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    //Gestion Clientes

    public void gestionarClientes() {
        int menu = 0;
        do {
            System.out.println("1. Crear cliente");
            System.out.println("2. Eliminar cliente");
            System.out.println("3. Modificar cliente");
            System.out.println("4. Ver todos los clientes");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    eliminarCliente();
                    break;
                case 3:
                    modificarCliente();
                    break;
                case 4:
                    verClientes();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (menu != 5);

    }

    public void verClientes() {
        for (Clientes cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void modificarCliente() {
        System.out.println("Ingrese el Documento del cliente a modificar: ");
        double documento = leer.nextDouble();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == documento) {
                int menu = 0;
                do {
                    System.out.println("Que desea modificar: ");
                    System.out.println("1. Nombre");
                    System.out.println("2. Apellido");
                    System.out.println("3. Mail");
                    System.out.println("4. Domicilio");
                    System.out.println("5. Telefono");
                    System.out.println("6. Salir");
                    menu = leer.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre: ");
                            clientes.get(i).setNombre(leer.next());
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo apellido: ");
                            clientes.get(i).setApellido(leer.next());
                            break;
                        case 3:
                            System.out.println("Ingrese el nuevo mail: ");
                            clientes.get(i).setMail(leer.next());
                            break;
                        case 4:
                            System.out.println("Ingrese el nuevo domicilio: ");
                            clientes.get(i).setDomicilio(leer.next());
                            break;
                        case 5:
                            System.out.println("Ingrese el nuevo telefono: ");
                            clientes.get(i).setTelefono(leer.nextDouble());
                            break;
                        case 6:
                            System.out.println("Saliendo");
                            break;
                    }
                } while (menu != 6);
            }
        }
    }

    public void eliminarCliente() {
        System.out.println("Ingrese el Documento del cliente a eliminar: ");
        double documento = leer.nextDouble();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == documento) {
                clientes.remove(i);
                System.out.println("Cliente eliminado correctamente");
            } else {
                System.out.println("Cliente no encontrado");
            }
        }
    }

    public void crearCliente() {
        Clientes clientesObj = new Clientes();
        clientesObj.setNombre("Yasar");
        clientesObj.setApellido("Chavez");
        clientesObj.setDocumento(456789);
        clientesObj.setMail("chavezyasar@gmail.com");
        clientesObj.setDomicilio("Santa Fe");
        clientesObj.setTelefono(12345678);
//        System.out.println("Ingrese el nombre: ");
//        clientesObj.setNombre(leer.next());
//        System.out.println("Ingrese el apellido: ");
//        clientesObj.setApellido(leer.next());
//        System.out.println("Ingrese el documento: ");
//        clientesObj.setDocumento(leer.nextDouble());
//        System.out.println("Ingrese el mail: ");
//        clientesObj.setMail(leer.next());
//        System.out.println("Ingrese el domicilio: ");
//        clientesObj.setDomicilio(leer.next());
//        System.out.println("Ingrese el telefono: ");
//        clientesObj.setTelefono(leer.nextDouble());
        clientes.add(clientesObj);
        System.out.println("Cliente creado correctamente");
    }

    //Gention Vehiculos
    public void gestionarVehiculos() {
        System.out.println("Ingrese el documento del cliente: ");
        double documento = leer.nextDouble();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == documento) {
                int menu = 0;
                do {
                    System.out.println("Que desea hacer: ");
                    System.out.println("1. Crear vehiculo");
                    System.out.println("2. Eliminar vehiculo");
                    System.out.println("3. Modificar vehiculo");
                    System.out.println("4. Ver todos los vehiculos del cliente");
                    System.out.println("5. Salir");
                    menu = leer.nextInt();
                    switch (menu) {
                        case 1:
                            crearVehiculo(documento);
                            break;
                        case 2:
                            eliminarVehiculo(documento);
                            break;
                        case 3:
                            modificarVehiculo(documento);
                            break;
                        case 4:
                            verVehiculos(documento);
                            break;
                        case 5:
                            System.out.println("Saliendo...");
                            break;
                    }
                } while (menu != 5);
            } else {
                System.out.println("Cliente no encontrado");

            }
        }
    }

    public void crearVehiculo(double documento) {
        Vehiculo vehiculoObj = new Vehiculo();
        System.out.println("Ingrese la marca: ");
        vehiculoObj.setMarca(leer.next());
        System.out.println("Ingrese el modelo: ");
        vehiculoObj.setModelo(leer.next());
        System.out.println("Ingrese el anio: ");
        vehiculoObj.setAnio(leer.nextInt());
        System.out.println("Ingrese el numero de motor: ");
        vehiculoObj.setNumeroMotor(leer.nextDouble());
        System.out.println("Ingrese el chasis: ");
        vehiculoObj.setChasis(leer.next());
        System.out.println("Ingrese el color: ");
        vehiculoObj.setColor(leer.next());
        System.out.println("Ingrese el tipo: (camioneta, sedán, etc.) ");
        vehiculoObj.setTipo(leer.next());
//        System.out.println("Ingrese el numero de poliza: ");
//        int numeroPoliza = leer.nextInt();
//        for (Polizas poliza : polizas) {
//            if (poliza.getNumeroPoliza() == numeroPoliza) {
//                vehiculoObj.setPoliza(poliza);
//            } else {
//                System.out.println("Poliza no encontrada");
//            }
//        }
        for (Clientes duenio : clientes) {
            if (duenio.getDocumento() == documento) {
                vehiculoObj.setDuenio(duenio);
                vehiculos.add(vehiculoObj);
            } else {
                System.out.println("Cliente no encontrado");
            }
        }
    }

    private void modificarVehiculo(double documento) {
        System.out.println("Ingrese el numero de documento del cliente: ");
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == documento) {
                int menu = 0;
                do {
                    System.out.println("Qué desea modificar: ");
                    System.out.println("1. Marca");
                    System.out.println("2. Modelo");
                    System.out.println("3. Año");
                    System.out.println("4. Numero Motor");
                    System.out.println("5. Chasis");
                    System.out.println("6. Color");
                    System.out.println("7. Tipo");
                    System.out.println("8. Numero de Poliza");
                    System.out.println("9. Salir");
                    menu = leer.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese la nueva marca: ");
                            vehiculos.get(i).setMarca(leer.next());
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo modelo: ");
                            vehiculos.get(i).setModelo(leer.next());
                            break;
                        case 3:
                            System.out.println("Ingrese el nuevo año: ");
                            vehiculos.get(i).setAnio(leer.nextInt());
                            break;
                        case 4:
                            System.out.println("Ingrese el nuevo numero de motor: ");
                            vehiculos.get(i).setNumeroMotor(leer.nextDouble());
                            break;
                        case 5:
                            System.out.println("Ingrese el nuevo chasis: ");
                            vehiculos.get(i).setChasis(leer.next());
                            break;
                        case 6:
                            System.out.println("Ingrese el nuevo color: ");
                            vehiculos.get(i).setColor(leer.next());
                            break;
                        case 7:
                            System.out.println("Ingrese el nuevo tipo: ");
                            vehiculos.get(i).setTipo(leer.next());
                            break;
                        case 8:
                            System.out.println("Ingrese el nuevo numero de poliza: ");
                            int numeroPoliza = leer.nextInt();
                            for (Polizas poliza : polizas) {
                                if (poliza.getNumeroPoliza() == numeroPoliza && poliza.getCliente().getDocumento() == documento) {
                                    vehiculos.get(i).setPoliza(poliza);
                                } else {
                                    System.out.println("Poliza no encontrada");
                                }
                            }
                            break;
                        case 9:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;

                    }
                } while (menu != 9);
            } else {
                System.out.println("Cliente no encontrado");
            }
        }
    }

    private void eliminarVehiculo(double documento) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == documento) {
                for (int j = 0; j < vehiculos.size(); j++) {
                    if (vehiculos.get(j).getDuenio().getDocumento() == documento) {
                        System.out.println(vehiculos.get(j).getMarca());
                        System.out.println(vehiculos.get(j).getModelo());
                        System.out.println(vehiculos.get(j).getNumeroMotor());
                    }
                }
                System.out.println("Ingrese el numero de motor del vehiculo que desea eliminar: ");
                int numeroVehiculo = leer.nextInt();
                for (int j = 0; j < vehiculos.size(); j++) {
                    if (vehiculos.get(j).getNumeroMotor() == numeroVehiculo && vehiculos.get(j).getDuenio().getDocumento() == documento) {
                        System.out.println("Vehiculo eliminado");
                        vehiculos.remove(j);
                    } else {
                        System.out.println("Vehiculo no encontrado");
                    }
                }
            } else {
                System.out.println("Cliente no encontrado");
            }
        }
    }

    private void verVehiculos(double documento) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == documento) {
                for (int j = 0; j < vehiculos.size(); j++) {
                    if (vehiculos.get(j).getDuenio().getDocumento() == documento) {
                        System.out.println(vehiculos.get(j).getMarca());
                        System.out.println(vehiculos.get(j).getModelo());
                        System.out.println(vehiculos.get(j).getNumeroMotor());
                        if (polizas.size() > 0) {
                            System.out.println(vehiculos.get(j).getPoliza().getNumeroPoliza());
                        }
                    }
                }
            }
        }
    }

    public void gestionarSeguros() {
        System.out.println("*Gestion de seguros*");
        System.out.println("Ingrese el documento del cliente: ");
        double documento = leer.nextDouble();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == documento) {
                System.out.println("Cliente encontrado");
                int menu = 0;
                do {
                    System.out.println("1. Crear seguro");
                    System.out.println("2. Eliminar seguro");
                    System.out.println("3. Ver seguros");
                    System.out.println("4. Salir");
                    menu = leer.nextInt();
                    switch (menu) {
                        case 1:
                            crearSeguro(documento);
                            break;
                        case 2:
                            eliminarSeguro(documento);
                            break;
                        case 3:
                            verSeguros(documento);
                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                } while (menu != 4);
            } else {
                System.out.println("Cliente no encontrado");
            }
        }
    }

    private void verSeguros(double documento) {
        System.out.println("Seguros del cliente: ");
        for (int i = 0; i < polizas.size(); i++) {
            if (polizas.get(i).getCliente().getDocumento() == documento) {
                System.out.println(polizas.get(i));
            } else {
                System.out.println("Seguros no encontrados");
            }
            System.out.println();
        }
    }

    private void eliminarSeguro(double documento) {
        System.out.println("Ingrese el numero de seguro que desea eliminar: ");
        int numeroSeguro = leer.nextInt();
        for (int i = 0; i < polizas.size(); i++) {
            if (polizas.get(i).getNumeroPoliza() == numeroSeguro && polizas.get(i).getCliente().getDocumento() == documento) {
                System.out.println("Seguro eliminado");
                polizas.remove(i);
            } else {
                System.out.println("Seguro no encontrado");
            }
        }
    }

    private void crearSeguro(double documento) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento() == documento) {
                Polizas polizaX = new Polizas();
                /**
                 *     private Vehiculo vehiculo;
                 *     private Clientes cliente;
                 *     private double numeroPoliza;
                 *     private String fechaInicio;
                 *     private String fechaFin;
                 *     private int numeroCuotas;
                 *     private String formaPago;
                 *     private double totalAsegurado;
                 *     private boolean incluyeGranizo;
                 *     private double montoMaximoGranizo;
                 *     private String tipoCobertura;
                 */
                for (Clientes cliente : clientes) {
                    if (cliente.getDocumento() == documento) {
                        System.out.println("Ingrese el numero de poliza: ");
                        double numeroPoliza = leer.nextDouble();
                        for (Polizas poliza : polizas) {
                            if (poliza.getNumeroPoliza() == numeroPoliza) {
                                System.out.println("Poliza ya existe");
                            } else {
                                polizaX.setNumeroPoliza(numeroPoliza);
                            }
                        }
                        System.out.println("Seleccione un vehiculo: (por numero de motor) ");
                        for (Vehiculo vehiculo : vehiculos) {
                            if (vehiculo.getDuenio().getDocumento() == documento) {
                                System.out.println(vehiculo.getMarca());
                                System.out.println(vehiculo.getModelo());
                                System.out.println(vehiculo.getNumeroMotor());
                            }
                        }
                        double numeroMotor = leer.nextDouble();
                        boolean encontrado = false;
                        do {
                            for (Vehiculo vehiculo : vehiculos) {
                                if (vehiculo.getNumeroMotor() == numeroMotor && vehiculo.getDuenio().getDocumento() == documento && vehiculo.getPoliza() == null) {
                                    polizaX.setVehiculo(vehiculo);
                                    encontrado = true;
                                } else if (vehiculo.getNumeroMotor() == numeroMotor && vehiculo.getDuenio().getDocumento() == documento && vehiculo.getPoliza() != null) {
                                    System.out.println("El vehiculo ya tiene un seguro");
                                } else {
                                    System.out.println("Vehiculo no encontrado, intente nuevamente");
                                }
                            }
                        } while (!encontrado);
                        System.out.println("Ingrese la Fecha de Inicio");
                        polizaX.setFechaInicio(leer.next());
                        System.out.println("Ingrese la Fecha de Fin");
                        polizaX.setFechaFin(leer.next());
                        System.out.println("Ingrese el numero de cuotas");
                        polizaX.setNumeroCuotas(leer.nextInt());
                        System.out.println("Ingrese la forma de pago");
                        polizaX.setFormaPago(leer.next());
                        System.out.println("Ingrese el total asegurado");
                        polizaX.setTotalAsegurado(leer.nextDouble());
                        System.out.println("Ingrese si incluye granizo (true/false) por defecto es false");
                        polizaX.setIncluyeGranizo(leer.nextBoolean());
                        System.out.println("Ingrese el monto maximo de granizo");
                        polizaX.setMontoMaximoGranizo(leer.nextDouble());
                        System.out.println("Ingrese el tipo de cobertura");
                        polizaX.setTipoCobertura(leer.next());
                        polizas.add(polizaX);
                    }
                }
            } else {
                System.out.println("Cliente no encontrado");
            }
        }
    }
}
