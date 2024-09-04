package Ejercicios4;

import java.util.Scanner;

public class Ej49 {
    // Solicita un número y busca el primer múltiplo de este en un array, si no
    // existe un múltiplo en el array, da un mensaje de error.

    public static void main(String[] args) {
        int[] lista = { 1, 1, 2, 3, 4, 4, 10, 6, 7, 8, 8 };
        int num;
        boolean encontrado = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero");
        num = scanner.nextInt();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % num == 0) {
                System.out.println("El primer multiplo encontrado ha sido " + lista[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado ningun multiplo");
        }
    }

}
