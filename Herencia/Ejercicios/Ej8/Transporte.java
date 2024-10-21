package Herencia.Ejercicios.Ej8;

public class Transporte {

    protected float capacidad;
    protected int velocidadMaxima;

    public Transporte(float capacidad, int velocidadMaxima){
        this.capacidad = capacidad;
        this.velocidadMaxima = velocidadMaxima;
    }


    public void mover(){
        System.out.println("El transporte se mueve");
    }

}
