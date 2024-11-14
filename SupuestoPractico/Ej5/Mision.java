package SupuestoPractico.Ej5;

import java.util.Scanner;

public class Mision {

    int nivelDificultad;
    int recompensa;
    String descripcion;
    Estado estado;

    public Mision(int nivelDificultad, int recompensa, String descripcion, Estado estado) {
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
