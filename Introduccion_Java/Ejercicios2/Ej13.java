package Ejercicios2;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        // Diseñar un algoritmo que compruebe si un número es divisible por otro.

        int n, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce primer numero");
        n = scanner.nextInt();
        System.out.println("Introduce segundo numero");
        n2 = scanner.nextInt();

        if (n2 == 0) {
            System.out.println("El divisor no puede ser 0");
        } else {
            if (n % n2 == 0) {
                System.out.println(n + " es divisible entre " + n2);
            } else {
                System.out.println(n + " no es divisible entre " + n2);
            }
        }
    }

}
