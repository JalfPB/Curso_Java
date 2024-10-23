package Excepciones.Ejercicios;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Ej1 {
    /*
     * Programa que pida al usuario que ingrese dos números e intente dividir
     *  el primero por el segundo. Se debe captura la excepción de división
     *  por cero y mostrar un mensaje adecuado (arithmetic exception).
     */

    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero 1");
        n1 = scanner.nextInt();
        System.out.println("Introduce numero 2");
        n2 = scanner.nextInt();

        try{
            int resul = n1 / n2;
            System.out.println(resul);
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir entre cero");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
        }
    }

}
