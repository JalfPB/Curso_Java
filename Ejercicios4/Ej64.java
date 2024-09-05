package Ejercicios4;

import java.util.Random;
import java.util.Scanner;

public class Ej64 {
    // Solicita números al usuario y calcula el producto de los números impares
    // ingresados. Finaliza cuando se ingrese un número par.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1, multiplicacion=1;

        do {
            System.out.println("Introduce numero");
            n = scanner.nextInt();
            if(n%2!=0)
            multiplicacion = multiplicacion * n;
            System.out.println("El producto es: " + multiplicacion);
        } while (n%2!=0);
    }
}
