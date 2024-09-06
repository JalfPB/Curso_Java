package Ejercicios2;

import java.util.Scanner;

public class Ej29 {

    public static void main(String[] args) {
        //Escribe un algoritmo que pida un número al usuario y calcule su factorial.

        Scanner scanner = new Scanner(System.in);
        int n, aux, numOriginal;

        System.out.println("Introduce numero para calcular factorial");
        aux = scanner.nextInt();
        n = aux;
        numOriginal=aux;

        while(aux-1!=0){
            if(aux-1!=0){
                aux=aux-1;
                System.out.println(n + " * " + aux + " = " + (n*aux));
                n = n*aux;
            }
            System.out.println(n);
        }
        System.out.println("El factorial de " + numOriginal + " es: " + n);
    }
}
