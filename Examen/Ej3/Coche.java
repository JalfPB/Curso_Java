package Examen.Ej3;

public class Coche extends Vehiculo{

    public Coche(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void describir() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo);
        
    }

    @Override
    public void arrancar() {
        System.out.println("El coche está arrancando");
        
    }

}
