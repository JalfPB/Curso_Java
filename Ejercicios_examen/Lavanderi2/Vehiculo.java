package Lavanderi2;

public class Vehiculo {
    private String id;
    private int capacidadMaxima;
    private String estado; // "En camino", "Disponible", "Mantenimiento"

    public Vehiculo(String id, int capacidadMaxima, String estado) {
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
        this.estado = estado;
    }

    public boolean estaDisponible() {
        return estado.equals("Disponible");
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
}