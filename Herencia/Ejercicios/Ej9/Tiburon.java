package Herencia.Ejercicios.Ej9;

public class Tiburon extends AnimalMarino{

    public Tiburon(String nombre,float tamanio){
        super(nombre,tamanio);
    }

    @Override
    public void nadar(){
        System.out.println("El tiburon nada");
    }

}
