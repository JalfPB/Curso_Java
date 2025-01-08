package SupuestoPractico.Ej7;

import java.io.Serializable;
import java.util.HashMap;

public class Nodo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre; // Identificador del nodo (cliente o lavandería)
    private HashMap<Nodo, Integer> conexiones; // Conexiones con distancias

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.conexiones = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarConexion(Nodo destino, int distancia) {
        conexiones.put(destino, distancia);
    }

    public HashMap<Nodo, Integer> getConexiones() {
        return conexiones;
    }
}
