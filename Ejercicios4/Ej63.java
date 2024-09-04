package Ejercicios4;

import java.util.Random;
import java.util.Scanner;

public class Ej63 {
    // Pide al usuario una palabra y cuenta cuántos caracteres tiene. Repite hasta
    // que el usuario ingrese un número negativo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra;
        int n = 1;

        do {
            System.out.println("Introduce palabra");
            palabra = scanner.nextLine();
            try {
                n = Integer.parseInt(palabra);
            } catch (Exception e) {
                System.out.println("La palabra tiene " + palabra.length() + " caracteres");
            }
        } while (n > 0);
    }

}
