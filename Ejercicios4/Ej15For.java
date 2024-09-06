package Ejercicios4;
import java.util.Scanner;

public class Ej15For {

    static void esPalindromo(int n) {
        int r, sum = 0, temp;
        temp = n;

        // Convertir el while en un for loop
        for (; n > 0; n /= 10) {
            r = n % 10;
            sum = (sum * 10) + r;
        }

        if (temp == sum)
            System.out.println("El numero es palindromo");
        else
            System.out.println("El numero no es palindromo");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero:");
        int n = scanner.nextInt();

        esPalindromo(n);

}
}
