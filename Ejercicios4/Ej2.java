package Ejercicios4;

import java.util.Scanner;

public class Ej2 {
    // Escribe un programa que determine si un año es bisiesto o no.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce año para comprobar si es bisiesto:");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }

}
