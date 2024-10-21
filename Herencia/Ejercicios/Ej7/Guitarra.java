package Herencia.Ejercicios.Ej7;

public class Guitarra extends Instrumento{

    public Guitarra(){
        super();
    }

    @Override
    public void tocar(){
        System.out.println("La guitarra rasga");
    }

}
