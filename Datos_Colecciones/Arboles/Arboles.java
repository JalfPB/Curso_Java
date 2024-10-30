package Datos_Colecciones.Arboles;

public class Arboles {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        //Insertar valores en el arbol
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Recorrer el arbol en orden

        System.out.println("Recorrido in-orden del arbol:");
        bst.inOrderTransversal(bst.root);

        // Buscar un valor en el arbol
        System.out.println("Se encontro 40? " + bst.search(40));
        System.out.println("¿Se encontro 25? " + bst.search(25));
        
    }

}
