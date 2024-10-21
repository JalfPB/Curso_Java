package Polimorfismo.EjerciciosPolimorfismo.Ej7;

public abstract class Vehiculo {

    private String modelo;

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void acelerar();

    public String getModelo() {
        return modelo;
    }
}
