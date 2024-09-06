package Ejercicios2;

import java.util.Scanner;

public class Ej24 {

    public static void main(String[] args) {
        //Escribe 	un algoritmo que le pida al usuario una calificación (0-100) y le 	muestre si la calificación es "Aprobado" o "Suspenso".
        //Se considera "Aprobado" si la calificación es mayor o 	igual a 60.

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Introduce calificacion");
        n = scanner.nextInt();

        if(n>=60){
            System.out.println("Estas aprobado");
        }else{
            System.out.println("Estas suspenso");
        }
    }

}
