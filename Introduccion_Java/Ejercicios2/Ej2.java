package Ejercicios2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Cuenta cuántos números pares se ingresan hasta que se introduzca un número negativo.
        int n, suma = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Introduce numero");
            n = scanner.nextInt();
            if(n%2==0)
                suma++;
        }while(n>=0);
        System.out.println("Se han introducido " + suma + " numeros pares");
    }
}
