package Datos_Colecciones.Ejercicios.Ej9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GrafoNoDirigido {

    // Mapa de adyacencia para almacenar el grafo usando enteros como vértices.
    private Map<Integer, List<Integer>> adyacencia;

    public GrafoNoDirigido() {
        this.adyacencia = new HashMap<>();
    }

    public void agregarVertice(int vertice) {
        adyacencia.putIfAbsent(vertice, new ArrayList<>());
    }

    // Metodo para agregar una arista entre dos vértices.
    public void agregarArista(int vertice1, int vertice2) {
        adyacencia.putIfAbsent(vertice1, new ArrayList<>());
        adyacencia.putIfAbsent(vertice2, new ArrayList<>());
        adyacencia.get(vertice1).add(vertice2);
        adyacencia.get(vertice2).add(vertice1); // Para grafo no dirigido
    }

    // Metodo para realizar una búsqueda en profundidad (DFS) desde un vértice inicial.
    public List<Integer> dfs(int inicio) {
        Set<Integer> visitados = new HashSet<>();
        List<Integer> recorrido = new ArrayList<>();
        dfsRecursivo(inicio, visitados, recorrido);
        return recorrido;
    }

    private void dfsRecursivo(int vertice, Set<Integer> visitados, List<Integer> recorrido) {
        if (!visitados.contains(vertice)) {
            visitados.add(vertice);
            recorrido.add(vertice);
            for (int vecino : adyacencia.getOrDefault(vertice, new ArrayList<>())) {
                dfsRecursivo(vecino, visitados, recorrido);
            }
        }
    }

    public void mostrarGrafo() {
        for (int vertice : adyacencia.keySet()) {
            System.out.println(vertice + " -> " + adyacencia.get(vertice));
        }
    }

}
