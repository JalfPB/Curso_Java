package Polimorfismo.EjerciciosPolimorfismo.Ej5;

import java.util.Objects;

public class Producto {

    String nombre;
    float precio;

    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Producto producto = (Producto) obj;
        return nombre == producto.nombre && Objects.equals(precio, producto.precio);
    }

}
