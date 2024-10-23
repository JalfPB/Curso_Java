package Excepciones.Ejercicios;

import java.util.Scanner;

public class Ej7 {
    /*
     * Solicita un número entero al usuario e intenta calcular su factorial recursivamente.
     *  Maneja la excepción de StackOverflowError si se ingresa un número demasiado grande.
     * Todos los ejercicios deben contener TRY, CATCH y FINALLY.
     */

     public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
           result = result * i;
        }
        return result;
      }

     public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;

        System.out.println("Introduce numero para calcular factorial");
        
        try{
            n = s.nextInt();
            System.out.println(getFactorial(n));
        } catch (StackOverflowError e){
            System.out.println("Ha habido un error al calcular el factorial");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }
        
     }

}
