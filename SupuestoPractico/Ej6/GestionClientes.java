package SupuestoPractico.Ej6;

import java.io.Serializable;
import java.util.HashMap;

public class GestionClientes implements Serializable{

    private HashMap<String, Cliente> clientes = new HashMap<>();

    public void agregarCliente(Cliente cliente) {
        clientes.put(cliente.getTelefono(), cliente);
    }

    public Cliente buscarCliente(String telefono) {
        return clientes.get(telefono);
    }

}

