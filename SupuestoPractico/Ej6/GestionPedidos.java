package SupuestoPractico.Ej6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class GestionPedidos implements Serializable{
    private ArrayList<Pedido> listaPedidos = new ArrayList<>();
    private Queue<Pedido> pedidosPendientes = new LinkedList<>();
    private Stack<Prenda> prendasProcesadas = new Stack<>();

    public void agregarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
        pedidosPendientes.offer(pedido);
        try {
            guardarPedidoEnArchivo(pedido, "SupuestoPractico\\Ej6\\pedidos.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar el pedido en el archivo: " + e.getMessage());
        }
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public Pedido procesarPedido() {
        Pedido pedido = pedidosPendientes.poll();
        if (pedido != null) {
            for (Prenda prenda : pedido.getPrendas()) {
                prendasProcesadas.push(prenda);
            }
        }
        return pedido;
    }

    public void mostrarPedidos(){
        for (Pedido p : listaPedidos) {
            System.out.println(p.toString());
        }
    }

    private void guardarPedidoEnArchivo(Pedido pedido, String archivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write("Estado: " + pedido.getEstado());
            writer.newLine();
            writer.write("Fecha: " + new SimpleDateFormat("yyyy-MM-dd").format(pedido.getFechaRecepcion()));
            writer.newLine();
            writer.write("Prendas:");
            writer.newLine();
            for (Prenda prenda : pedido.getPrendas()) {
                writer.write(prenda.getClass().getSimpleName() + "," + prenda.getPrecioBase() + "," + prenda.getEstado());
                writer.newLine();
            }
            writer.write("-----"); // Separador entre pedidos
            writer.newLine();
        }
    }
}
