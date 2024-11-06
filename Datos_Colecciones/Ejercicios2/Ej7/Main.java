package Datos_Colecciones.Ejercicios2.Ej7;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);

        grafo.agregarArista(1, 2, 4);
        grafo.agregarArista(1, 3, 1);
        grafo.agregarArista(3, 2, 2);
        grafo.agregarArista(2, 4, 1);
        grafo.agregarArista(4, 1, 3);


        System.out.println("Grafo:");
        grafo.mostrarGrafo();

        System.out.println("\n¿El grafo tiene ciclo? " + grafo.tieneCiclo());

        System.out.println("\nDistancias más cortas desde el vértice 1:");
        Map<Integer, Integer> distancias = grafo.dijkstra(1);
        for (int vertice : distancias.keySet()) {
            System.out.println("Distancia a " + vertice + " = " + distancias.get(vertice));
        }
    }

}
