package Datos_Colecciones.Arboles;

public class BinarySearchTree {
    Node root; // Raiz del arbol

    // Metodo para insertat un valor en el arbol
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    // Metodo recursivo que inserta un nuevo nodo en el lugar correcto
    private Node insertRecursive(Node node, int value) {
        // Si llegamos a un nodo vacio, se crea un nuevo nodo
        if (node == null) {
            return new Node(value);
        }

        // Si el valor es menor, se inserta en el subarbol izquierdo
        if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }
        // Si el valor ya existe, no se inserta de nuevo
        return node;
    }

    // Metodo para buscar un valor en el arbol
    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    // Metodo recursivo que busca un valor en le arbol
    private boolean searchRecursive(Node node, int value) {
        // Si llegamos a un nodo vacio, el valor no esta presente
        if (node == null) {
            return false;
        }

        // Si el valor coincide con el nodo actual
        if (value == node.value) {
            return true;
        }

        // Si el valor es menor, buscamos en el subarbol izquierdo
        return value < node.value
                ? searchRecursive(node.left, value)
                : searchRecursive(node.right, value);
    }

    // Metodo para recorrer el arbol en in-orden (izquierda, raiz, derecha, )
    public void inOrderTransversal(Node node) {
        if (node != null) {
            inOrderTransversal(node.left);
            System.out.println(node.value + " ");
            inOrderTransversal(node.right);
        }
    }

}
