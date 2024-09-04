package Ejercicios4;

import java.util.Scanner;

public class Ej66 {
    // Escribe un programa que cuente cuántos números pares hay en un array lleno
    // por el usuario.

    public static void main(String[] args) {
        int[] lista = new int[10];
        Scanner scanner = new Scanner(System.in);
        int n, par=0;

        for(int i = 0; i < lista.length; i++){
            System.out.println("Introduce numero");
            n = scanner.nextInt();
            lista[i]=n;
            if(n%2==0){
                par++;
            }
        }

        System.out.println("Hay " + par + " pares en el array");
    }

}
