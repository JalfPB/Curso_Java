package Ejercicios2;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        //Diseñar un algoritmo que dados dos números, X e Y, compruebe si son iguales y en caso de no ser iguales, nos diga cual es el mayor de ellos.

        int n, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero 1");
        n = scanner.nextInt();
        System.out.println("Introduce numero 2");
        n2 = scanner.nextInt();

        if(n==n2){
            System.out.println("Son iguales");
        }else{
            if(n>n2){
                System.out.println(n + " es mayor que " + n2);
            }else{
                System.out.println(n2 + " es mayor que " + n);
            }
        }
    }

}
