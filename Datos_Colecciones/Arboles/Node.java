package Datos_Colecciones.Arboles;

public class Node {
    int value; // Valor del nodo
    Node left, right; // Referencias a los nodos hijos izquierdo y derecho

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

}
