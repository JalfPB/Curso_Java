package SupuestoPractico.Ej6;

import java.io.Serializable;

public abstract class Prenda implements Serializable{
    private String estado; // Sucio, En proceso de limpieza, Listo
    private double precioBase;

    public Prenda(double precioBase, String estado) {
        this.precioBase = precioBase;
        this.estado = estado;
    }

    public abstract String getTipo();

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Prenda [estado=" + estado + ", precioBase=" + precioBase + "]";
    }

    

}