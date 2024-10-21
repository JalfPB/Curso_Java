package Herencia.Ejercicios.Ej9;

public class Delfin extends AnimalMarino{

    public Delfin(String nombre,float tamanio){
        super(nombre,tamanio);
    }

    @Override
    public void nadar(){
        System.out.println("El delfin nada");
    }

}
