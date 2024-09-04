package Ejercicios4;

import java.util.Scanner;

public class Ej20 {
    //Solicita un número e imprime todos sus divisores.

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        n = scanner.nextInt();

        for(int i = 1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

}
