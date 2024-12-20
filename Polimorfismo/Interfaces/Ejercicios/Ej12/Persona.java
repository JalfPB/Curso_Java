package Polimorfismo.Interfaces.Ejercicios.Ej12;

public class Persona implements Comparable<Persona>{


    int edad;
    String nombre;

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona p) {
        return Integer.compare(this.edad, p.edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

}
