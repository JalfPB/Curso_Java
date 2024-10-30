package Datos_Colecciones.Ejercicios.Ej5;

public class ArbolBinarioBusqueda {

    private Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }

        return nodo;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }

        if (valor == nodo.valor) {
            return true;
        } else if (valor < nodo.valor) {
            return buscarRecursivo(nodo.izquierdo, valor);
        } else {
            return buscarRecursivo(nodo.derecho, valor);
        }
    }

    public void recorrerEnOrden() {
        recorrerEnOrdenRecursivo(raiz);
    }

    private void recorrerEnOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorrerEnOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerEnOrdenRecursivo(nodo.derecho);
        }
    }

    public int calcularAltura() {
        return calcularAlturaRecursivo(raiz);
    }

    private int calcularAlturaRecursivo(Nodo nodo) {
        if (nodo == null) {
            return -1;
        } else {
            int alturaIzquierda = calcularAlturaRecursivo(nodo.izquierdo);
            int alturaDerecha = calcularAlturaRecursivo(nodo.derecho);
            return 1 + Math.max(alturaIzquierda, alturaDerecha);
        }
    }
}
