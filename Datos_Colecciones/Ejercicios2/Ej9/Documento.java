package Datos_Colecciones.Ejercicios2.Ej9;

public class Documento {
    String nombre;
    int prioridad;

    public Documento(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nombre='" + nombre + '\'' +
                ", prioridad=" + (prioridad == 1 ? "Alta" : "Normal") +
                '}';
    }
}
