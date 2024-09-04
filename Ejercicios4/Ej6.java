package Ejercicios4;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        // Escribe un programa que calcule el valor absoluto de un número.
        Scanner scanner = new Scanner(System.in);
        int n, vAbsoluto;

        System.out.println("Introduce numero");
        n = scanner.nextInt();

        if (n >= 0) {
            vAbsoluto = n;
        } else {
            vAbsoluto = (n * -2) + n;
        }

        System.out.println("El valor absoluto de " + n + " es " + vAbsoluto);
    }
}
