package Lavanderi2;

public class NodoCliente {
    private String nombre;
    private String direccion;
    private double distancia;

    public NodoCliente(String nombre, String direccion, double distancia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getDistancia() {
        return distancia;
    }
}