package Ejercicios4;

import java.util.Scanner;

public class Ej13 {
    //Escribe un programa que determine si dos números son consecutivos y ambos son pares.

    static void comprobarConsecutivo(int n1, int n2){
        if(n2 == n1+1){
            System.out.print("Son consecutivos, ");

            if(n1%2==0 && n2%2==0){
                System.out.print(" y ambos sonm pares");
            }else{
                System.out.print(" pero uno de ellos no es par");
            }
        }else{
            System.out.println("No son consecutivos");
        }

        

    }

    public static void main(String[] args) {
        int n1,n2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero 1");
        n1 = scanner.nextInt();
        System.out.println("Introduce numero 2");
        n2 = scanner.nextInt();

        comprobarConsecutivo(n1, n2);
    }

}
