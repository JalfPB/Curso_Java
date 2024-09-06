package Ejercicios4;
import java.util.Scanner;

public class Ej1While {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, max = 0, min = 0;
        int i = 1; // Contador para controlar el ciclo while

        while (i <= 3) {
            System.out.println("Introduce num " + i);
            n = scanner.nextInt();

            // Si es la primera iteración, inicializamos max y min con el primer número
            if (i == 1) {
                max = n;
                min = n;
            } else {
                if (n > max) {
                    max = n;
                } 
                if (n < min) {
                    min = n;
                }
            }

            i++;
        }
        System.out.println("El número mayor es " + max + " y el menor es " + min);
    }

}
