package Datos_Colecciones.Grafos;

import java.util.LinkedList;

public class Graph {
    private int numVertices;
    private LinkedList<Integer>[] adjacencyList;

    // Constructor del grapho
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];

        // Inicializar cada lista de adyacencia para cada vertice
        for(int i = 0; i < numVertices; i++){
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Metodo para agregar una arista entre dos nodos (no dirigido)
    public void addEdge(int src, int dest) {
        adjacencyList[ src ].add(dest);
        adjacencyList[ dest ].add(src); // Por ser un grafo no dirigido
    }

    // metodo para mostrar el grafo
    public void printGraph() {
        for(int i = 0; i < numVertices; i++){
            System.out.println("Vertice " + i + " esta conectado a: ");
            for(Integer vertex : adjacencyList[i]) {
                System.out.println(vertex + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int vertex, boolean[] visited){
        visited[vertex] = true;
        System.out.println(vertex + " ");

        for(Integer v : adjacencyList[vertex]) {
            if (!visited[v]) {
                depthFirstSearch(v, visited);
            }
        }
    }

}
