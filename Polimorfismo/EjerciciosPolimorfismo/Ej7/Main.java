package Polimorfismo.EjerciciosPolimorfismo.Ej7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Moto("Kawasaki"));
        vehiculos.add(new Camion("Man"));
        vehiculos.add(new Moto("Scooter"));
        vehiculos.add(new Camion("Mercedes"));

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar();

            if (vehiculo instanceof Moto) {
                Moto moto = (Moto) vehiculo;
                moto.hacerCaballito();
            } else if (vehiculo instanceof Camion) {
                Camion camion = (Camion) vehiculo;
                camion.cargarMercancia();
            }

            System.out.println();
        }
    }
}

