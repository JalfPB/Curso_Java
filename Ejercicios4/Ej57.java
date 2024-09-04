package Ejercicios4;

import java.util.Scanner;

public class Ej57 {
    // Escribe un programa que pida al usuario ingresar un número dentro de un rango
    // específico (por ejemplo, entre 1 y 10). Si el número ingresado no está dentro
    // del rango, el programa debe pedir el número nuevamente.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0, suma = 0;

        
        do {
            System.out.println("Introduce numero del 1 al 10");
            numero = scanner.nextInt();
            if(numero < 1 || numero > 10){
                System.out.println("Fuera de rango");
            }
        } while (numero < 1 || numero > 10);

    }

}
