package Herencia.Ejercicios.Ej7;

public class Violin extends Instrumento{

    public Violin(){
        super();

    }

    @Override
    public void tocar(){
        System.out.println("El violin suena");
    }

}
