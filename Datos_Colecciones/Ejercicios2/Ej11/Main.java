package Datos_Colecciones.Ejercicios2.Ej11;

public class Main {
    /*
     * Escribe un método que encuentre el valor mínimo en un árbol binario de
     * búsqueda.
     */
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.raiz = new Node(10);
        arbol.raiz.izquierdo = new Node(5);
        arbol.raiz.derecho = new Node(20);
        arbol.raiz.izquierdo.izquierdo = new Node(3);
        arbol.raiz.izquierdo.derecho = new Node(7);

        int minimo = arbol.encontrarMinimo();
        System.out.println("El valor mínimo en el árbol es: " + minimo);
    }

}
