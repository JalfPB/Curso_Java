package Datos_Colecciones.Ejercicios2.Ej7;
import java.util.*;

public class Grafo {
    // Mapa de adyacencia para almacenar el grafo ponderado.
    private Map<Integer, List<Arista>> adyacencia;

    public Grafo() {
        this.adyacencia = new HashMap<>();
    }

    // Clase interna para representar una arista ponderada
    private class Arista {
        int destino;
        int peso;

        public Arista(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }

    // Método para agregar un vértice
    public void agregarVertice(int vertice) {
        adyacencia.putIfAbsent(vertice, new ArrayList<>());
    }

    // Método para agregar una arista ponderada entre dos vértices (para grafo dirigido)
    public void agregarArista(int vertice1, int vertice2, int peso) {
        adyacencia.putIfAbsent(vertice1, new ArrayList<>());
        adyacencia.get(vertice1).add(new Arista(vertice2, peso));
    }

    // Método para detectar ciclos en un grafo dirigido usando DFS
    public boolean tieneCiclo() {
        Set<Integer> visitados = new HashSet<>();
        Set<Integer> recursivoStack = new HashSet<>();

        for (int vertice : adyacencia.keySet()) {
            if (tieneCicloDFS(vertice, visitados, recursivoStack)) {
                return true;
            }
        }
        return false;
    }

    private boolean tieneCicloDFS(int vertice, Set<Integer> visitados, Set<Integer> recursivoStack) {
        if (recursivoStack.contains(vertice)) {
            return true; // Ciclo detectado
        }
        if (visitados.contains(vertice)) {
            return false; // Ya visitado sin ciclo en este camino
        }

        visitados.add(vertice);
        recursivoStack.add(vertice);

        for (Arista arista : adyacencia.getOrDefault(vertice, new ArrayList<>())) {
            if (tieneCicloDFS(arista.destino, visitados, recursivoStack)) {
                return true;
            }
        }

        recursivoStack.remove(vertice); // Eliminar del stack de llamada recursiva
        return false;
    }

    // Método para encontrar el camino más corto desde un vértice inicial usando el algoritmo de Dijkstra
    public Map<Integer, Integer> dijkstra(int inicio) {
        Map<Integer, Integer> distancias = new HashMap<>();
        PriorityQueue<Arista> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.peso));

        for (int vertice : adyacencia.keySet()) {
            distancias.put(vertice, Integer.MAX_VALUE);
        }
        distancias.put(inicio, 0);

        pq.add(new Arista(inicio, 0));

        while (!pq.isEmpty()) {
            Arista aristaActual = pq.poll();
            int verticeActual = aristaActual.destino;

            for (Arista aristaVecina : adyacencia.getOrDefault(verticeActual, new ArrayList<>())) {
                int vecino = aristaVecina.destino;
                int nuevaDistancia = distancias.get(verticeActual) + aristaVecina.peso;

                if (nuevaDistancia < distancias.get(vecino)) {
                    distancias.put(vecino, nuevaDistancia);
                    pq.add(new Arista(vecino, nuevaDistancia));
                }
            }
        }

        return distancias;
    }

    // Método para mostrar el grafo
    public void mostrarGrafo() {
        for (int vertice : adyacencia.keySet()) {
            System.out.print(vertice + " -> ");
            for (Arista arista : adyacencia.get(vertice)) {
                System.out.print("[" + arista.destino + ", peso: " + arista.peso + "] ");
            }
            System.out.println();
        }
    }
}
