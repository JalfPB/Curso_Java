package Datos_Colecciones.Ejercicios2.Ej4;

public class Tarea {

    String nombre;
    boolean completada;

    public Tarea(String nombre, boolean completada){
        this.nombre = nombre;
        this.completada = completada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

}
