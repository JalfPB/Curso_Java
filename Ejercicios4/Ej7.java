package Ejercicios4;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        // Escribe un programa que asigne una calificación de letra (A, B, C, D, F)
        // basada en una calificación numérica.
        Scanner scanner = new Scanner(System.in);
        float calNumerica;
        char calLetra;

        System.out.println("Introduce calificacion");
        calNumerica = scanner.nextFloat();

        if (calNumerica >= 9.5) {
            calLetra = 'A';
        } else if (calNumerica >= 8 && calNumerica < 9.5) {
            calLetra = 'B';
        } else if (calNumerica >= 6 && calNumerica < 8) {
            calLetra = 'C';
        } else if (calNumerica >= 5 && calNumerica < 6) {
            calLetra = 'D';
        } else {
            calLetra = 'F';
        }

        System.out.println("Tu calificacion es de " + calLetra);

    }

}
