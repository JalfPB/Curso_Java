package Polimorfismo.EjerciciosPolimorfismo.Ej2;

public abstract class Animal {

    String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }
    // Metodo abstracto, no tiene implementacion
    abstract void makeSound();

    // Metodo concreto, tiene implementacion
    void sleep(){
        System.out.println("The animal is sleeping");
    }

    // Metodo concreto con parametros
    void eat(String food){
        System.out.println(this.nombre + " esta comiendo " + food);
    }

}
