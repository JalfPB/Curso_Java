package SupuestoPractico.Ej7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // Crear inventario
        InventarioServicios inventario = new InventarioServicios();
        inventario.agregar("Camisa", 50);
        inventario.agregar("Pantalón", 30);
        inventario.agregar("Vestido", 20);

        // Crear vehículos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("V1", 10, "Disponible"));
        vehiculos.add(new Vehiculo("V2", 15, "Disponible"));
        vehiculos.add(new Vehiculo("V3", 8, "Mantenimiento"));

        // Crear grafo de rutas
        GrafoRutas grafo = new GrafoRutas();
        grafo.agregarNodo("Lavandería");
        grafo.agregarNodo("Cliente1");
        grafo.agregarNodo("Cliente2");
        grafo.agregarNodo("Cliente3");

        grafo.conectarNodos("Lavandería", "Cliente1", 5);
        grafo.conectarNodos("Lavandería", "Cliente2", 10);
        grafo.conectarNodos("Cliente1", "Cliente2", 3);
        grafo.conectarNodos("Cliente2", "Cliente3", 8);

        // Crear cola de pedidos pendientes
        Queue<String> pedidosPendientes = new LinkedList<>();
        pedidosPendientes.add("Cliente1: Camisa x2, Pantalón x1");
        pedidosPendientes.add("Cliente2: Vestido x1");
        pedidosPendientes.add("Cliente3: Camisa x3");

        // Proceso de entregas
        while (!pedidosPendientes.isEmpty()) {
            String pedido = pedidosPendientes.poll();
            System.out.println("Procesando pedido: " + pedido);

            // Simular búsqueda de vehículo disponible
            Vehiculo vehiculoDisponible = null;
            for (Vehiculo v : vehiculos) {
                if (v.getEstado().equals("Disponible")) {
                    vehiculoDisponible = v;
                    break;
                }
            }

            try {
                if (vehiculoDisponible == null) {
                    throw new VehiculoNoDisponibleException("No hay vehículos disponibles para realizar la entrega.");
                }

                // Asignar vehículo y marcarlo como "En camino"
                System.out.println("Asignando vehículo: " + vehiculoDisponible.getId());
                vehiculoDisponible.setEstado("En camino");

                // Buscar ruta óptima (asumiendo el cliente está en el pedido)
                String[] pedidoPartes = pedido.split(":");
                String cliente = pedidoPartes[0].trim();
                Ruta rutaOptima = grafo.encontrarRutaOptima("Lavandería", cliente);

                System.out.println("Ruta óptima encontrada:");
                for (Nodo nodo : rutaOptima.getNodos()) {
                    System.out.print(nodo.getNombre() + " -> ");
                }
                System.out.println("Distancia total: " + rutaOptima.getDistanciaTotal());

                // Simular entrega completada
                vehiculoDisponible.setEstado("Disponible");
                System.out
                        .println("Entrega completada para " + cliente + " con vehículo " + vehiculoDisponible.getId());
            } catch (VehiculoNoDisponibleException e) {
                System.out.println(e.getMessage());
            }
        }

        // Comprobar disponibilidad en inventario
        System.out.println("\nConsulta de inventario:");
        System.out.println("Camisas disponibles: " + inventario.buscar("Camisa"));
        System.out.println("Pantalones disponibles: " + inventario.buscar("Pantalón"));
        System.out.println("Vestidos disponibles: " + inventario.buscar("Vestido"));
    }

}
