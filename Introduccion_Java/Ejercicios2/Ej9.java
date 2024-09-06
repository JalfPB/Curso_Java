package Ejercicios2;

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        //Escriba un algoritmo que pida un número entero mayor que 1 y que escriba si el número es un número primo o no.

        int n, c=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero entero mayor que 1");
        n = scanner.nextInt();

        if(n < 1){
            System.out.println("El numero es menor que 1");
        }else{
            for(int i = 1; i <= n; i++){
                if(n%i==0){
                    c++;
                }
            }
        }

        if(c>2){
            System.out.println("El numero no es primo");
        }else{
            System.out.println("El numero es primo");
        }
    }

}
