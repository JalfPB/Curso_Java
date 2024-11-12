package Alamcenamiento_Datos;

import java.io.Serializable;

public class Persona implements Serializable{

    private static final long serialVersionUID = 1L; // Identificador unico para la clase
    private String nombre;
    private int edad;
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    

}
