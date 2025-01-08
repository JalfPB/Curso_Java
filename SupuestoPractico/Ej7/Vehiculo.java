package SupuestoPractico.Ej7;

import java.io.Serializable;

public class Vehiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private int capacidadMaxima;
    private String estado; // "En camino", "Disponible", "Mantenimiento"

    public Vehiculo(String id, int capacidadMaxima, String estado) {
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

