package Ejercicios4;

import java.util.Scanner;

public class Ej67 {
    //Calcula el promedio de los elementos de un array ingresado por el usuario.

    public static void main(String[] args) {
        int[] lista = new int[10];
        Scanner scanner = new Scanner(System.in);
        int n, promedio=0;

        for(int i = 0; i < lista.length; i++){
            System.out.println("Introduce numero");
            n = scanner.nextInt();
            lista[i]=n;
            promedio+=n;
        }

        promedio = promedio/lista.length;
        System.out.println("El promedio de los elementos del array es: " + promedio);
    }

}
