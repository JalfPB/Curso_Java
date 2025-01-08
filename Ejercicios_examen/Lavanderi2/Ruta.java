package Lavanderi2;

import java.util.HashMap;
import java.util.Map;

public class Ruta {
    private Map<String, Map<String, Double>> grafo;

    public Ruta() {
        this.grafo = new HashMap<>();
    }

    public void agregarRuta(String origen, String destino, double distancia) {
        grafo.putIfAbsent(origen, new HashMap<>());
        grafo.get(origen).put(destino, distancia);
    }

    public double obtenerDistancia(String origen, String destino) {
        if (grafo.containsKey(origen) && grafo.get(origen).containsKey(destino)) {
            return grafo.get(origen).get(destino);
        }
        return Double.MAX_VALUE; // Devuelve un valor muy alto si no existe ruta
    }
}