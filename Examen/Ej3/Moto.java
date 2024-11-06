package Examen.Ej3;

public class Moto extends Vehiculo{

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
