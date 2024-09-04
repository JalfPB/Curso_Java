package Ejercicios4;

import java.util.Scanner;

public class Ej61 {

    // Escribe un programa que pida una frase y cuente el número de palabras. El
    // programa no debe tener un método de salida.

    public static void main(String[] args) {
        String frase = "";
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Introduce frase");
        frase = scanner.nextLine();
        contador += frase.split(" ").length;

    }
}
