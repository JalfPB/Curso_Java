package Herencia.Ejercicios.Ej9;

public class Ballena extends AnimalMarino{

    public Ballena(String nombre,float tamanio){
        super(nombre,tamanio);
    }

    @Override
    public void nadar(){
        System.out.println("La Ballena nada");
    }

}
