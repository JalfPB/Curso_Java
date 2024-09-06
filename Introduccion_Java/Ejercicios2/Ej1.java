package Ejercicios2;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        //Calcula la suma de una serie de números ingresados por el usuario hasta que se introduzca un cero.
        int n, suma = 0;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Introduce numero");
            n = scanner.nextInt();
            suma +=n;
        }while(n!=0);
        System.out.println("la suma de los numeros es: " + suma);
    }
}
