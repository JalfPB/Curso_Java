package Ejercicios4;

import java.util.Scanner;

public class Ej68 {
    // Pide al usuario llenar un array y sustituye los valores negativos por cero.

    public static void main(String[] args) {
        int[] lista = new int[10];
        Scanner scanner = new Scanner(System.in);
        int n;

        for(int i = 0; i < lista.length; i++){
            System.out.println("Introduce numero");
            n = scanner.nextInt();
            if(n<0)
                lista[i]=0; // Se comprueba que el numero sea positivo, en caso 
            else            // contrario se reemplaza por 0
                lista[i]=n;
        }

        System.out.println("La lista sin negativos");
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
        
    }

}
