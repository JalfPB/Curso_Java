package Examen.Ej3;

import java.util.ArrayList;

public class Main {
    /*
     * Problema: Crea un programa que modele una jerarquía de vehículos:
        Interfaz Conducible con el método arrancar().
        Clase abstracta Vehiculo con atributos marca y modelo, y un método abstracto describir().
        Clase Coche que extiende de Vehiculo e implementa Conducible:
        Sobrescribe el método arrancar() para imprimir "El coche está arrancando".
        Implementa el método describir() para imprimir "Marca: [marca], Modelo: [modelo]".
        Clase Moto que extiende de Vehiculo e implementa Conducible:
        Sobrescribe el método arrancar() para imprimir "La moto está arrancando".
        Implementa el método describir() para imprimir "Marca: [marca], Modelo: [modelo]".
        En la clase principal, crea un array de Vehiculo y prueba polimorfismo llamando a los métodos arrancar() y describir().
     */

    public static void main(String[] args) {
        ArrayList<Vehiculo> lista = new ArrayList<>();

        lista.add(new Coche("Renault", "Clio"));
        lista.add(new Moto("Kawasaki", "Noc"));
        lista.add(new Coche("Seat", "Altea"));

        for (Vehiculo vehiculo : lista) {

            vehiculo.arrancar();
            vehiculo.describir();
            
        }

    }
}
