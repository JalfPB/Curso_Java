package Examen.Ej3;

public abstract class Vehiculo implements Conducible{

    String marca;
    String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void describir();

}
