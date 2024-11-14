package SupuestoPractico.Ej3;

public class Estudiante extends Persona{

    private String nombre;
    private int edad;
    private double nota;
    private String dni;

    public Estudiante(String nombre, int edad, double nota, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.dni = dni;
    }

    public Estudiante(Estudiante estudiante) {
        this.dni = estudiante.getDni();
        this.nota = estudiante.getNota();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + ", dni=" + dni + "]";
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Alumno con nombre: " + nombre + ", edad: " + edad +
        ", nota: " + nota + ", DNI: " + dni);
    }

    

    

}
