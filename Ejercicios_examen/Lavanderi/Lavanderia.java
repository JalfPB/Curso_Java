package Lavanderi;

import java.util.*;

public class Lavanderia {
    private HashMap<String, Cliente> clientes; // Teléfono como clave
    private ArrayList<Pedido> pedidos;
    private Stack<Prenda> prendasEnProceso;
    private Queue<Pedido> pedidosPendientes;

    public Lavanderia() {
        clientes = new HashMap<>();
        pedidos = new ArrayList<>();
        prendasEnProceso = new Stack<>();
        pedidosPendientes = new LinkedList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.put(cliente.getTelefono(), cliente);
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedidosPendientes.add(pedido);
    }

    public Pedido buscarPedido(String estado) throws PedidoNoEncontradoException {
        return pedidos.stream()
                .filter(p -> p.getEstado().equals(estado))
                .findFirst()
                .orElseThrow(() -> new PedidoNoEncontradoException("Pedido no encontrado."));
    }

    public void procesarPrenda(Prenda prenda) {
        prendasEnProceso.push(prenda);
    }


}