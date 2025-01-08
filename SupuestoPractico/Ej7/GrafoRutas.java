package SupuestoPractico.Ej7;

import java.util.*;

public class GrafoRutas {
    private Map<String, Nodo> nodos;

    public GrafoRutas() {
        this.nodos = new HashMap<>();
    }

    public void agregarNodo(String nombre) {
        nodos.put(nombre, new Nodo(nombre));
    }

    public void conectarNodos(String origen, String destino, int distancia) {
        Nodo nodoOrigen = nodos.get(origen);
        Nodo nodoDestino = nodos.get(destino);
        if (nodoOrigen != null && nodoDestino != null) {
            nodoOrigen.agregarConexion(nodoDestino, distancia);
            nodoDestino.agregarConexion(nodoOrigen, distancia); // Si es bidireccional
        }
    }

    public Ruta encontrarRutaOptima(String inicio, String fin) {
        Map<Nodo, Integer> distancias = new HashMap<>();
        Map<Nodo, Nodo> predecesores = new HashMap<>();
        Set<Nodo> visitados = new HashSet<>();
        PriorityQueue<NodoDistancia> cola = new PriorityQueue<>(Comparator.comparingInt(NodoDistancia::getDistancia));

        Nodo nodoInicio = nodos.get(inicio);
        if (nodoInicio == null) {
            throw new IllegalArgumentException("El nodo de inicio no existe.");
        }

        distancias.put(nodoInicio, 0);
        cola.add(new NodoDistancia(nodoInicio, 0));

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll().getNodo();
            if (visitados.contains(actual)) continue;
            visitados.add(actual);

            for (Map.Entry<Nodo, Integer> conexion : actual.getConexiones().entrySet()) {
                Nodo vecino = conexion.getKey();
                int distancia = conexion.getValue();

                int nuevaDistancia = distancias.getOrDefault(actual, Integer.MAX_VALUE) + distancia;
                if (nuevaDistancia < distancias.getOrDefault(vecino, Integer.MAX_VALUE)) {
                    distancias.put(vecino, nuevaDistancia);
                    predecesores.put(vecino, actual);
                    cola.add(new NodoDistancia(vecino, nuevaDistancia));
                }
            }
        }

        List<Nodo> ruta = new ArrayList<>();
        Nodo actual = nodos.get(fin);
        while (actual != null) {
            ruta.add(0, actual);
            actual = predecesores.get(actual);
        }

        return new Ruta(ruta, distancias.getOrDefault(nodos.get(fin), Integer.MAX_VALUE));
    }

    private static class NodoDistancia {
        private Nodo nodo;
        private int distancia;

        public NodoDistancia(Nodo nodo, int distancia) {
            this.nodo = nodo;
            this.distancia = distancia;
        }

        public Nodo getNodo() {
            return nodo;
        }

        public int getDistancia() {
            return distancia;
        }
    }
}

