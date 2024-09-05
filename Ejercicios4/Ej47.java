package Ejercicios4;

import java.util.Scanner;

public class Ej47 {
    // Solicita al usuario una lista de números y elimina los negativos.

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
        int[] lista = new int[10];
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce numero");
            num = scanner.nextInt();
            lista[i] = num;
        }

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < 0) {
                lista[i] = 0;
            }
        }

        imprimirArray(lista);

    }

}
