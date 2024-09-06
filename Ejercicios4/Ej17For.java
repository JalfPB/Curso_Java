package Ejercicios4;

import java.util.Scanner;

public class Ej17For {

    public static void main(String[] args) {
        int num, r, sum = 0, armstrong = 0, aux;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero");
        num = scanner.nextInt();
        aux = num;

        if (num < 100 || num > 999) {
            System.out.println("Numero no valido");
        } else {
            // Convertimos el while en un bucle for
            for (; aux > 0; aux /= 10) {
                r = aux % 10;
                sum = (sum * 10) + r;

                // armstrong es la suma de los dígitos elevados al cubo
                armstrong += Math.pow(r, 3);
            }

            // Comprobar si el número es Armstrong
            if (armstrong == num) {
                System.out.println(num + " es un número Armstrong");
            } else {
                System.out.println(num + " no es un número Armstrong");
            }
        }
    }
}
