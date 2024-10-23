package Polimorfismo.Interfaces;

public class Main {

    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();
        Vehiculo miBici = new Bici();

        miCoche.conducir();
        miCoche.detener();

        miBici.conducir();
        miBici.detener();

    }

}
