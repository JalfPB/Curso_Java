package Ejercicios2;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        // Escribe un algoritmo que pida al usuario que ingrese una contraseña hasta que
        // la ingrese correctamente.
        String contrasena = "hola12", intento;
        Scanner scanner = new Scanner(System.in);
        boolean acierto = false;

        do {
            System.out.println("Ingrese contrasena");
            intento = scanner.nextLine();
            if (contrasena.equals(intento)) {
                acierto = true;
            } else {
                System.out.println("Fallo!");
            }
        } while (!acierto);
        System.out.println("Has acertado");
    }
}
