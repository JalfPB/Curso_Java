package Datos_Colecciones.Ejercicios2.Ej11;


public class ArbolBinarioBusqueda {
    Node raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public int encontrarMinimo() {
        if (raiz == null) {
            throw new IllegalStateException("El árbol está vacío.");
        }

        Node actual = raiz;
        while (actual.izquierdo != null) {
            actual = actual.izquierdo;
        }
        
        return actual.valor;
    }
}