package Ejercicios4;

import java.util.Scanner;

public class Ej15 {
    // Verifica si un número de tres dígitos es palíndromo.

    static void esPalindromo(int n) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("El numero es palindromo");
        else
            System.out.println("El numero no es palindromo");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero");
        int n = scanner.nextInt();

        esPalindromo(n);
    }
}
