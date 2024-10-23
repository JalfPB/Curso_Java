package Polimorfismo.Interfaces.Ejercicios.Ej10;

public class Artista implements Cantante, Bailarin{

    public void cantar(){
        System.out.println("El artista canta");
    }

    public void bailar(){
        System.out.println("El artista baila");
    }

}
