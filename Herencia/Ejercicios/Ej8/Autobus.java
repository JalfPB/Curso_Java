package Herencia.Ejercicios.Ej8;

public class Autobus extends Transporte{

    public Autobus(float capacidad, int velocidadMaxima){
        super(capacidad,velocidadMaxima);
    }

    @Override
    public void mover(){
        System.out.println("El autobus va por la carretera");
    }

}
