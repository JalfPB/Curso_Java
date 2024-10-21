package Herencia.Ejercicios.Ej8;

public class Tren extends Transporte{


    public Tren(float capacidad,int velocidadMaxima){
        super(capacidad,velocidadMaxima);

    }

    @Override
    public void mover(){
        System.out.println("El tren va por las vias");
    }
}
