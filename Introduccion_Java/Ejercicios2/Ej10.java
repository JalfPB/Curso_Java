package Ejercicios2;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        //Escriba un algoritmo que pregunte cuántos números se van a introducir, pida esos números, y escriba el mayor, el menor y la media aritmética.

        int cantidad, n, promedio = 0, max = 0, min = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir cantidad de numeros");
        cantidad = scanner.nextInt();
        for(int i = 0; i < cantidad; i++){
            System.out.println("Introduce numero " + (i+1));
            n = scanner.nextInt();
            if(i == 0){
                max=n;
                min=n;
            }

            if(n>max){
                max = n;
            }
            if(n<min){
                min = n;
            }
            if(n<0){
                System.out.println(n + " es negativo");
            }
            promedio += n;
        }

        promedio = promedio/cantidad;
        System.out.println("El promedio de los numeros introducidos es: " + promedio);
        System.out.println("El numero mas alto introducido es " + max + " y el mas pequeño " + min);
    }

}
