package Polimorfismo.Interfaces.Ejercicios.Ej4;

public class Triatleta implements Ciclista, Nadador, Corredor{

    public void pedalear(){
        System.out.println("El atleta pedalea");
    }

    public void nadar(){
        System.out.println("El atleta nada");
    }

    public void correr(){
        System.out.println("El atleta corre");
    }

}
