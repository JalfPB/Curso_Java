package Lavanderi;
import java.io.Serializable;

public abstract class Prenda implements Serializable {
    private String tipo;
    private double precioBase;
    private String estado; // sucio, en proceso, listo

    public Prenda(String tipo, double precioBase, String estado) {
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.estado = estado;
    }

    public String getTipo() { return tipo; }
    public double getPrecioBase() { return precioBase; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return tipo + " (" + estado + ") - Precio: " + precioBase;
    }
}



