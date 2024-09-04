package Ejercicios4;

import java.util.Scanner;

public class Ej28 {
    // Solicita al usuario números y los imprime, deteniéndose cuando un número se
    // repite.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0, previo;
        
        do{
            previo=n;
            System.out.println("Introduce numeros");
            n = scanner.nextInt();
            System.out.println("El numero introducido es: " + n);
            

        }while(previo!=n);
    }

}
