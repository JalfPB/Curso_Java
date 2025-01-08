package Lavanderi2;

public class Servicio {
    private String tipoPrenda;
    private int cantidad;

    public Servicio(String tipoPrenda, int cantidad) {
        this.tipoPrenda = tipoPrenda;
        this.cantidad = cantidad;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void reducirCantidad() {
        if (cantidad > 0) cantidad--;
    }
}