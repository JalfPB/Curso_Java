package Ejercicios2;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        //Algoritmo que pida la cantidad de números a ingresar y después calcule el promedio de esos números.
        int cantidad, n, promedio=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir cantidad de numeros");
        cantidad = scanner.nextInt();
        for(int i = 0; i < cantidad; i++){
            System.out.println("Introduce numero " + (i+1));
            n = scanner.nextInt();
            promedio += n;
        }

        promedio = promedio/cantidad;
        System.out.println("El promedio de los numeros introducidos es: " + promedio);
    }

}
