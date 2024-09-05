package Ejercicios4;

import java.util.Random;

public class Ej88 {

    // Escribe un método que genere un array de n números aleatorios dentro de un
    // rango dado.

    static int[] generarArray(int longitud, int rango) {
        Random randomNumber = new Random();
        int[] aleatorios = new int[longitud];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = randomNumber.nextInt(rango);
        }

        return aleatorios;

    }

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] aleatorios = generarArray(10, 10);

        System.out.println("Los contenidos del Array son: ");
        imprimirArray(aleatorios);
        
    }

}
