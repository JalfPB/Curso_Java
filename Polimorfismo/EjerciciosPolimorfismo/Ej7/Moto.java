package Polimorfismo.EjerciciosPolimorfismo.Ej7;

public class Moto extends Vehiculo {

    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto " + getModelo() + " acelera");
    }

    public void hacerCaballito() {
        System.out.println("La moto " + getModelo() + " hace un caballito");
    }
}

