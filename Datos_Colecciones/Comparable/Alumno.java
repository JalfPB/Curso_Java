package Datos_Colecciones.Comparable;

public class Alumno implements Comparable<Alumno>{

    private String nombre;
    private String nia;
    private int edad;
    // constructores, getters y setters

    @Override
    public int compareTo(Alumno a){
        int comparacion = Integer.compare(this.edad, edad);
        if( comparacion == 0 ) comparacion = this.nombre.compareTo(a.nombre);
        return comparacion;
    } // Ordenamos por edad, de menor a mayor, y luego por nombre

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + "]";
    }

    public Alumno(String nombre, String nia, int edad) {
        this.nombre = nombre;
        this.nia = nia;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
