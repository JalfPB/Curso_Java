package Polimorfismo.EjerciciosPolimorfismo.Ej1;

public class Main {

    public static void main(String[] args) {
        Vehiculo bici = new Bicicleta();
        Vehiculo carro = new Carro();

        bici.moverse();
        carro.moverse();
    }

}
