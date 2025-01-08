package Lavanderi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Pedido implements Serializable {
    private ArrayList<Prenda> prendas;
    private String estado; // Recibido, En proceso, Listo para recoger
    private Date fechaRecepcion;

    public Pedido(Date fechaRecepcion) {
        this.prendas = new ArrayList<>();
        this.estado = "Recibido";
        this.fechaRecepcion = fechaRecepcion;
    }

    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }

    public ArrayList<Prenda> getPrendas() { return prendas; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Pedido (Estado: " + estado + ", Fecha: " + fechaRecepcion + ", Prendas: " + prendas + ")";
    }
}