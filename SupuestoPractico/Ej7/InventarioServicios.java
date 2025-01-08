package SupuestoPractico.Ej7;

class NodoInventario {
    String tipoPrenda;
    int cantidad;
    NodoInventario izquierda;
    NodoInventario derecha;

    public NodoInventario(String tipoPrenda, int cantidad) {
        this.tipoPrenda = tipoPrenda;
        this.cantidad = cantidad;
        this.izquierda = null;
        this.derecha = null;
    }
}

public class InventarioServicios {
    private NodoInventario raiz;

    public void agregar(String tipoPrenda, int cantidad) {
        raiz = agregarRecursivo(raiz, tipoPrenda, cantidad);
    }

    private NodoInventario agregarRecursivo(NodoInventario actual, String tipoPrenda, int cantidad) {
        if (actual == null) {
            return new NodoInventario(tipoPrenda, cantidad);
        }
        if (tipoPrenda.compareTo(actual.tipoPrenda) < 0) {
            actual.izquierda = agregarRecursivo(actual.izquierda, tipoPrenda, cantidad);
        } else if (tipoPrenda.compareTo(actual.tipoPrenda) > 0) {
            actual.derecha = agregarRecursivo(actual.derecha, tipoPrenda, cantidad);
        } else {
            actual.cantidad += cantidad;
        }
        return actual;
    }

    public int buscar(String tipoPrenda) {
        return buscarRecursivo(raiz, tipoPrenda);
    }

    private int buscarRecursivo(NodoInventario actual, String tipoPrenda) {
        if (actual == null) {
            return 0; // No encontrado
        }
        if (tipoPrenda.equals(actual.tipoPrenda)) {
            return actual.cantidad;
        }
        return tipoPrenda.compareTo(actual.tipoPrenda) < 0
                ? buscarRecursivo(actual.izquierda, tipoPrenda)
                : buscarRecursivo(actual.derecha, tipoPrenda);
    }
}

