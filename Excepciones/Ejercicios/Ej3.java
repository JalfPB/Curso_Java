package Excepciones.Ejercicios;

import java.util.Scanner;

public class Ej3 {
    /*
     * Crea un array de enteros e intenta acceder a un índice proporcionado por el usuario.
     *  Maneja la excepción ArrayIndexOutOfBoundsException.
     */

     public static void main(String[] args) {
        int[] lista = {1,2,3};
        Scanner scanner = new Scanner(System.in);
        int indice;

        System.out.println("Introduce indice al que acceder");
        indice = scanner.nextInt();
        try{
            System.out.println(lista[indice]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El indice no existe");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
        }
     }

}
