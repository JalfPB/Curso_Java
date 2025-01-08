package SupuestoPractico.Ej6;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Pedido implements Serializable{
    private String estado; // Recibido, En proceso, Listo para recoger
    private Date fechaRecepcion;
    private List<Prenda> prendas;

    public Pedido(String estado, Date fechaRecepcion, List<Prenda> prendas) {
        this.estado = estado;
        this.fechaRecepcion = fechaRecepcion;
        this.prendas = prendas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }

    // Metodos para actualizar el estado
    public void actualizarEstado(String estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido [estado=" + estado + ", fechaRecepcion=" + fechaRecepcion + ", prendas=" + prendas + "]";
    }
    
}

