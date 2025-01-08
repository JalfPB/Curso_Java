package SupuestoPractico.Ej7;

import java.io.Serializable;
import java.util.List;

public class Ruta implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Nodo> nodos;
    private int distanciaTotal;

    public Ruta(List<Nodo> nodos, int distanciaTotal) {
        this.nodos = nodos;
        this.distanciaTotal = distanciaTotal;
    }

    public List<Nodo> getNodos() {
        return nodos;
    }

    public int getDistanciaTotal() {
        return distanciaTotal;
    }
}

