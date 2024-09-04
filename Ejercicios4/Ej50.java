package Ejercicios4;

import java.util.Scanner;

public class Ej50 {
    // Solicita números para llenar un array y suma los elementos hasta que la suma
    // alcance un límite.

    public static void main(String[] args) {
        int[] lista = new int[10];
        int num, suma = 0, limite = 10;
        boolean encontrado = false;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce numero");
            num = scanner.nextInt();
            lista[i] = num;
        }

        // Se suman los elementos hasta que se cruce el limite
        for (int i = 0; i < lista.length; i++) {
            if (suma <= limite) {
                suma += lista[i];
            }
        }

        System.out.println("La suma hasta el limite ha sido: " + suma);

    }

}
