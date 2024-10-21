package Herencia.Ejercicios.Ej9;

public class AnimalMarino {

    protected String nombre;
    protected float tamanio;

    public AnimalMarino(String nombre, float tamanio){
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public void nadar(){
        System.out.println("El animal nada");
    }

}
