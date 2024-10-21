package Herencia.Ejercicios.Ej8;

public class Avion extends Transporte{

    public Avion(float capacidad,int velocidadMaxima){
        super(capacidad,velocidadMaxima);

    }

    @Override
    public void mover(){
        System.out.println("El Avion se mueve por el aire");
    }

}
