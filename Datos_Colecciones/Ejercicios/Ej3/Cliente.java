package Datos_Colecciones.Ejercicios.Ej3;

public class Cliente {
    String nombre;
    int tiempoDeAtencion;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoDeAtencion() {
        return tiempoDeAtencion;
    }

    public void setTiempoDeAtencion(int tiempoDeAtencion) {
        this.tiempoDeAtencion = tiempoDeAtencion;
    }

}
