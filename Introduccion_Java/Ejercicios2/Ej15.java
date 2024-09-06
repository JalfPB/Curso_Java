package Ejercicios2;

import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {
        //Escribe un algoritmo que determine si un número ingresado por el usuario es múltiplo de 5.

        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        n = scanner.nextInt();

        if(n%5==0){
            System.out.println(n + " es multiplo de 5");
        }
    }

}
