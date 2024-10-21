package Polimorfismo.EjerciciosPolimorfismo.Ej2;

public class Gato extends Animal{

    public Gato(String nombre){
        super(nombre);
    }

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

}
