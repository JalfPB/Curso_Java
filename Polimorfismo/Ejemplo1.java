package Polimorfismo;

abstract class Animal {
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

class Dog extends Animal {
    public Dog(String nombre){
        super(nombre);
    }

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    public Cat(String nombre){
        super(nombre);
    }

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Ejemplo1 {

    public static void main(String[] args) {
        Animal dog = new Dog("Fido");
        Animal cat = new Cat("Whiskers");

        dog.makeSound();
        dog.sleep();
        dog.eat("Huesos");

        cat.makeSound();
        cat.sleep();
        cat.eat("pescado");
    }

}
