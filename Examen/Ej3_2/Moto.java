package Examen.Ej3_2;

public class Moto  extends Vehiculo implements Conducible{

    public Moto(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void describir() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo);
        
    }

    @Override
    public void arrancar() {
        System.out.println("La moto está arrancando");
        
    }

}
