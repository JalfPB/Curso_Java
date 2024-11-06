package Examen.Ej6;

import java.util.Scanner;

public class Main {
    /*
     * Problema: Crea un método recursivo factorial(int n) 
     * que calcule el factorial de un número. Si el número 
     * es menor que 0, lanza una excepción
     *  IllegalArgumentException con el mensaje "Número no 
     * válido".
     */

     public static int factorial(int num) {

        // Se lanza la excepcion si el numero es menor a 0
        if (num<0) throw new IllegalArgumentException("Número no valido");

        // Se calcula el factorial
        if(num == 0) return 1;
        else return num*factorial(num-1);

      }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Introduce numero para calcular factorial");
        
        n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }

}
