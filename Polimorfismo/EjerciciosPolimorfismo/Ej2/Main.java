package Polimorfismo.EjerciciosPolimorfismo.Ej2;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Perro("Fido");
        Animal cat = new Gato("Whiskers");

        dog.makeSound();
        dog.sleep();
        dog.eat("Huesos");

        cat.makeSound();
        cat.sleep();
        cat.eat("pescado");
    }
}
