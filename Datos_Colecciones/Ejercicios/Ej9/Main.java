package Datos_Colecciones.Ejercicios.Ej9;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GrafoNoDirigido grafo = new GrafoNoDirigido();
        grafo.agregarVertice(0);
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);

        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(3, 4);
        grafo.agregarArista(3, 5);

        System.out.println("Grafo:");
        grafo.mostrarGrafo();

        System.out.println("\nBúsqueda en profundidad");
        List<Integer> recorridoDFS = grafo.dfs(1);
        System.out.println(recorridoDFS);

        grafo.mostrarGrafo();
    }

}
