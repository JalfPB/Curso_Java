package Datos_Colecciones.Grafos;

public class Grafo {

    public static void main(String[] args) {
        // Crear un grafo con 5 vertices
        Graph graph = new Graph(5);

        // Agregar aristas al grafo
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Mostrar el grafo
        graph.printGraph();
        
    }

}
