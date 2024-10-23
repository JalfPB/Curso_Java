package Excepciones.Ejercicios;

import java.util.Scanner;

public class Ej5 {
    /*
     * Solicita una cadena al usuario y un índice de inicio y fin
     *  para extraer una subcadena. Maneja posibles excepciones de
     *  StringIndexOutOfBoundsException.
     */

     public static void main(String[] args) {
        String cadena;
        Scanner scanner = new Scanner(System.in);
        int inI, inF;

        try{
            System.out.println("Introduce cadena");
            cadena = scanner.nextLine();
            System.out.println("Introduce indice de inicio y indice de final");
            inI = scanner.nextInt();
            inF = scanner.nextInt();

            cadena = cadena.substring(inI, inF);
            System.out.println(cadena);


        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Error, indices fuera de rango");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
        } 
     }

}
