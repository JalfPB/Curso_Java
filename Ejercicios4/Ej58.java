package Ejercicios4;

import java.util.Random;
import java.util.Scanner;

public class Ej58 {
    // Programa que genere contraseñas aleatorias de una longitud dada por el
    // usuario.

    static String generarContrasena(int longitud) {
        Random randomNumber = new Random();
        // El banco de caracteres
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = randomNumber.nextInt(banco.length()-1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }



    public static void main(String[] args) {
        int longitud;
        String contrasena;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce longitud de la contraseña");
        longitud = scanner.nextInt();

        contrasena = generarContrasena(longitud);

        System.out.println("Tu contrasena es: " + contrasena);
    }

}
