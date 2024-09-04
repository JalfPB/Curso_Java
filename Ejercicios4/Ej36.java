package Ejercicios4;

import java.util.Scanner;

public class Ej36 {
    //Cuenta cuántos elementos en un array son mayores que un valor dado.

    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero a comparar");
        int n = scanner.nextInt();
        int contador = 0;

        for(int i = 0; i<lista.length; i++){
            if(lista[i]>n)
                contador++;
        }

        System.out.println("Hay " + contador + " numeros mas grandes que " + n);
    }

}
