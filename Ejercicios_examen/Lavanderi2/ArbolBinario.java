package Lavanderi2;

public class ArbolBinario {
    private NodoServicio raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void agregarServicio(Servicio servicio) {
        raiz = agregarRecursivo(raiz, servicio);
    }

    private NodoServicio agregarRecursivo(NodoServicio nodo, Servicio servicio) {
        if (nodo == null) {
            return new NodoServicio(servicio);
        }
        if (servicio.getTipoPrenda().compareTo(nodo.getServicio().getTipoPrenda()) < 0) {
            nodo.setIzquierda(agregarRecursivo(nodo.getIzquierda(), servicio));
        } else {
            nodo.setDerecha(agregarRecursivo(nodo.getDerecha(), servicio));
        }
        return nodo;
    }

    public Servicio buscarServicio(String tipoPrenda) {
        return buscarRecursivo(raiz, tipoPrenda);
    }

    private Servicio buscarRecursivo(NodoServicio nodo, String tipoPrenda) {
        if (nodo == null) {
            return null;
        }
        if (tipoPrenda.equals(nodo.getServicio().getTipoPrenda())) {
            return nodo.getServicio();
        }
        return tipoPrenda.compareTo(nodo.getServicio().getTipoPrenda()) < 0
            ? buscarRecursivo(nodo.getIzquierda(), tipoPrenda)
            : buscarRecursivo(nodo.getDerecha(), tipoPrenda);
    }
}

class NodoServicio {
    private Servicio servicio;
    private NodoServicio izquierda;
    private NodoServicio derecha;

    public NodoServicio(Servicio servicio) {
        this.servicio = servicio;
        this.izquierda = null;
        this.derecha = null;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public NodoServicio getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoServicio izquierda) {
        this.izquierda = izquierda;
    }

    public NodoServicio getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoServicio derecha) {
        this.derecha = derecha;
    }
}