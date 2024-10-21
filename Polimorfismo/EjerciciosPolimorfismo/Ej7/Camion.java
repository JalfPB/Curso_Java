package Polimorfismo.EjerciciosPolimorfismo.Ej7;

public class Camion extends Vehiculo {

    public Camion(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("El camión " + getModelo() + " acelera");
    }

    public void cargarMercancia() {
        System.out.println("El camion " + getModelo() + " esta cargando");
    }
}
