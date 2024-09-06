package Ejercicios4;
import java.util.Scanner;

public class Ej20While {

    public static void main(String[] args) {
        int n, i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        n = scanner.nextInt();

        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }

    }

}
