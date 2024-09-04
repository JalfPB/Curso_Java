package Ejercicios4;

import java.util.Scanner;

public class Ej2 {
    // Escribe un programa que determine si un año es bisiesto o no.
    public static void main(String[] args) {
        int anio = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce año para comprobar si es bisiesto");
        anio = scanner.nextInt();

        if (anio % 10 == 0) {
            if (anio % 400 == 0) {
                System.out.println("Es bisiesto");
            }
        } else {

            if (anio % 4 == 0) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        }

    }

}
