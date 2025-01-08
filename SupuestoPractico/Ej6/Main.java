package SupuestoPractico.Ej6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void guardarSistema(String archivo, GestionClientes gestionClientes, GestionPedidos gestionPedidos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(gestionClientes);
            oos.writeObject(gestionPedidos);
            System.out.println("Sistema guardado exitosamente en " + archivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el sistema: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Object[] cargarSistema(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            GestionClientes gestionClientes = (GestionClientes) ois.readObject();
            GestionPedidos gestionPedidos = (GestionPedidos) ois.readObject();
            System.out.println("Sistema cargado exitosamente desde " + archivo);
            return new Object[] { gestionClientes, gestionPedidos };
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el sistema: " + e.getMessage());
            return null;
        }
    }

    public static void actualizarEstado(GestionPedidos gestionPedidos) {
        // Scanner scanner = new Scanner(System.in);
        // Actualizar estado del pedido
        System.out.println("Ingrese el índice del pedido a actualizar (0, 1, 2, ...):");
        int indicePedido = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Obtener la lista de pedidos desde la clase GestionPedidos
        ArrayList<Pedido> listaPedidos = gestionPedidos.getListaPedidos();

        // Verificar si el índice es válido
        if (indicePedido < 0 || indicePedido >= listaPedidos.size()) {
            System.out.println("Índice de pedido inválido. Intente nuevamente.");
            // scanner.close();
            return;
        }

        Pedido pedido = listaPedidos.get(indicePedido);

        // Mostrar el estado actual y opciones
        System.out.println("Estado actual del pedido: " + pedido.getEstado());
        System.out.println("Seleccione el nuevo estado:");
        System.out.println("1. Recibido");
        System.out.println("2. En proceso");
        System.out.println("3. Listo para recoger");

        int nuevoEstado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Actualizar el estado basado en la selección
        switch (nuevoEstado) {
            case 1:
                pedido.setEstado("Recibido");
                break;
            case 2:
                pedido.setEstado("En proceso");
                break;
            case 3:
                pedido.setEstado("Listo para recoger");
                break;
            default:
                System.out.println("Estado inválido. No se realizaron cambios.");
                break;
        }

        System.out.println("El estado del pedido ha sido actualizado a: " + pedido.getEstado());
        // scanner.close();
    }

    public static void crearPedido(GestionPedidos gestionPedidos, GestionClientes gestionClientes) {
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el teléfono del cliente para asociar el pedido:");
        String telCliente = scanner.nextLine();
        Cliente cliente = gestionClientes.buscarCliente(telCliente);

        if (cliente == null) {
            System.out.println("Cliente no encontrado. Registre el cliente antes de crear un pedido.");
            // scanner.close();
            return;
        }

        try {

            // Crear lista de prendas para el pedido
            List<Prenda> prendas = new ArrayList<>();
            boolean agregarPrenda = true;
            while (agregarPrenda) {
                System.out.println("Seleccione el tipo de prenda:");
                System.out.println("1. Camisa");
                System.out.println("2. Pantalón");
                System.out.println("3. Vestido");
                int tipoPrenda = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                System.out.println("Ingrese el precio base de la prenda:");
                double precioBase = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer

                Prenda prenda;
                switch (tipoPrenda) {
                    case 1:
                        prenda = new Camisa(precioBase, "Sucia");
                        break;
                    case 2:
                        prenda = new Pantalon(precioBase, "Sucia");
                        break;
                    case 3:
                        prenda = new Vestido(precioBase, "Sucia");
                        break;
                    default:
                        System.out.println("Tipo de prenda no válido. Intente de nuevo.");
                        continue;
                }

                prendas.add(prenda);
                System.out.println("¿Desea agregar otra prenda? (s/n):");
                String respuesta = scanner.nextLine();
                agregarPrenda = respuesta.equalsIgnoreCase("s");
            }

            // Crear el pedido con la lista de prendas y el estado inicial
            Pedido pedido = new Pedido("Recibido", new Date(), prendas);
            gestionPedidos.agregarPedido(pedido);

            System.out.println("Pedido creado exitosamente para el cliente " + cliente.getNombre());
            // scanner.close();

        } catch (Exception e) {
            System.out.println("Ha oucurrido un error: ");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        GestionClientes gestionClientes = new GestionClientes();
        GestionPedidos gestionPedidos = new GestionPedidos();
        String rutaSistema = "SupuestoPractico\\Ej6\\sistema.bin";
        Object[] sistema = cargarSistema(rutaSistema);
        if (sistema != null) {
            gestionClientes = (GestionClientes) sistema[0];
            gestionPedidos = (GestionPedidos) sistema[1];
        }

        System.out.println("Bienvenido a la Lavandería");
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Crear Pedido");
            System.out.println("3. Actualizar Estado de Pedido");
            System.out.println("4. Mostrar Pedidos");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el teléfono:");
                    String telefono = scanner.nextLine();
                    System.out.println("Ingrese la dirección:");
                    String direccion = scanner.nextLine();
                    gestionClientes.agregarCliente(new Cliente(nombre, telefono, direccion));
                    guardarSistema(rutaSistema, gestionClientes, gestionPedidos);
                    break;
                case 2:
                    crearPedido(gestionPedidos, gestionClientes);
                    guardarSistema(rutaSistema, gestionClientes, gestionPedidos);
                    break;
                case 3:
                    actualizarEstado(gestionPedidos);
                    guardarSistema(rutaSistema, gestionClientes, gestionPedidos);
                    break;
                case 4:
                System.out.println("\n___PEDIDOS EN EL SISTEMA___");
                    gestionPedidos.mostrarPedidos();
                    guardarSistema(rutaSistema, gestionClientes, gestionPedidos);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
        scanner.close();
    }
}