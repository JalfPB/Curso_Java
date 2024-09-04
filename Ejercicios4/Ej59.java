package Ejercicios4;

import java.util.Scanner;

public class Ej59 {
    //Escribe un programa que pida un número y calcule su raíz cuadrada. Continúa pidiendo números hasta que se ingrese uno negativo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        do{
            System.out.println("Introduce numero");
            numero = scanner.nextInt();
            if(numero>=0)
                System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
        }while (numero>=0);

    }

}
