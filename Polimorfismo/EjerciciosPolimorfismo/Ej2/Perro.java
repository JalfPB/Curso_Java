package Polimorfismo.EjerciciosPolimorfismo.Ej2;

public class Perro extends Animal{
    public Perro(String nombre){
        super(nombre);
    }

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

}
