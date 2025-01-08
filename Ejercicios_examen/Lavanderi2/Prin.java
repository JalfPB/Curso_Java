package Lavanderi2;

import java.util.*;

public class Prin {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Inicialización
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("V1", 10, "Disponible"));
        vehiculos.add(new Vehiculo("V2", 5, "Disponible"));

        Ruta ruta = new Ruta();
        ruta.agregarRuta("Lavanderia", "Cliente1", 10.5);
        ruta.agregarRuta("Lavanderia", "Cliente2", 7.8);

        ArbolBinario inventario = new ArbolBinario();
        inventario.agregarServicio(new Servicio("Camisa", 50));
        inventario.agregarServicio(new Servicio("Pantalón", 30));

        // Ingreso de entrega
        System.out.print("Ingrese cliente: ");
        String cliente = scanner.nextLine();
        System.out.print("Ingrese dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese tipo de prenda: ");
        String prenda = scanner.nextLine();

        Servicio servicio = inventario.buscarServicio(prenda);
        if (servicio != null && servicio.getCantidad() > 0) {
            System.out.println("Servicio disponible: " + prenda);
            servicio.reducirCantidad();
        } else {
            System.out.println("Servicio no disponible.");
        }

        // Asignación de vehículo
        Vehiculo vehiculoDisponible = null;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.estaDisponible()) {
                vehiculoDisponible = vehiculo;
                vehiculo.setEstado("En camino");
                break;
            }
        }

        if (vehiculoDisponible != null) {
            System.out.println("Vehículo asignado: " + vehiculoDisponible.getId());
            GestorArchivos.escribirRuta("Ruta completada: " + cliente + " - " + direccion);
        } else {
            throw new VehiculoNoDisponibleException("No hay vehículos disponibles.");
        }
    }
}