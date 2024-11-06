package Examen.Ej3_2;

import java.util.ArrayList;

public class Main {
    // Igual que el ejercicio 3, solo que en este implementan la interfaz
    // las clases Coche y Moto en vez de Vehiculo

    public static void main(String[] args) {
        ArrayList<Vehiculo> lista = new ArrayList<>();

        lista.add(new Coche("Renault", "Clio"));
        lista.add(new Moto("Kawasaki", "Noc"));
        lista.add(new Coche("Seat", "Altea"));

        for (Vehiculo vehiculo : lista) {

            // Se comprueba si es instancia de Moto o Coche para ejecutar
            // su metodo arrancar
            if(vehiculo instanceof Moto) ((Moto)vehiculo).arrancar();
            if(vehiculo instanceof Coche) ((Coche)vehiculo).arrancar();

            if(vehiculo instanceof Moto) ((Moto)vehiculo).describir();
            if(vehiculo instanceof Coche) ((Coche)vehiculo).describir();

            
        }

    }

}
