package Examen.Ej5;

public class Persona implements Comparable<Persona>{

    String nombre;
    int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona p) {
        return Integer.compare(this.edad, p.edad);
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

}
