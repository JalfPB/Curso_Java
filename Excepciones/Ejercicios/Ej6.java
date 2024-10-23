package Excepciones.Ejercicios;

import java.util.Scanner;

public class Ej6 {
    /*
     * Solicita un número al usuario y calcula su raíz cuadrada.
     *  Captura cualquier excepción que ocurra.
     */

     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.println("Introduce numero para calcular la raiz cuadrada");
        
        try{
            n = s.nextInt();
            System.out.println(Math.sqrt(n));
        } catch (Exception e){
            System.out.println("Ha habido un error al calcular la raíz cuadrada");
            System.out.println(e.toString());
        }finally {
            System.out.println("Programa finalizado");
        }
     }

}
