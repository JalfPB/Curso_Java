package Lavanderi;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Teléfono: " + telefono + ", Dirección: " + direccion;
    }
}