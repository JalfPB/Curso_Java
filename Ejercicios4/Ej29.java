package Ejercicios4;

import java.util.Scanner;

public class Ej29 {
    // Solicita un número base y un exponente máximo y muestra los valores de la
    // serie exponencial hasta el exponente máximo.

    public static void main(String[] args) {
        int n,exp, aux = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce numero para calcular el exponente");
        n = scanner.nextInt();

        System.out.println("Introduce exponente maximo");
        exp = scanner.nextInt();

        for(int i = 1; i<=exp; i++){
            aux = (int)Math.pow(n,i);
            System.out.println(n + " elevado a " + i + " = " + aux);
        }
    }

}
