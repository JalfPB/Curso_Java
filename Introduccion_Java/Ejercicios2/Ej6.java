package Ejercicios2;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        //Algoritmo que lea 5 números e indique si alguno es negativo e indique el número más alto introducido y el más bajo.
        int n, max=0, min=0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5 ; i++){
            System.out.println("Introduce numero " + (i+1) + " de 5" );
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
        }
        System.out.println("El numero mas alto introducido es " + max + " y el mas pequeño " + min);
    }

}
