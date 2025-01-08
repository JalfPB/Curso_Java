package Lavanderi2;

public class NodoLavanderia {
    private String nombre;
    private String direccion;

    public NodoLavanderia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}