package Ejercicios2;

import java.util.Scanner;

public class Ej22 {

    public static void main(String[] args) {
        //Escribe un algoritmo que imprima la tabla de multiplicar de un número dado por el usuario.
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Introduce numero");
        n = scanner.nextInt();

        for(int i = 1; i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }

}
