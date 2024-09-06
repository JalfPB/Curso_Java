package Ejercicios2;

import java.util.Scanner;

public class Ej18 {

    public static void main(String[] args) {
        //Escribe un algoritmo que sume números ingresados por el usuario hasta que se ingrese un número negativo.

        int n, suma = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Introduce numero");
            n = scanner.nextInt();
            if(n>=0)
            suma += n;
        }while(n>=0);

        System.out.println("La suma de los numeros es: " + suma);
        
    }

}
