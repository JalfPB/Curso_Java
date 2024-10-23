package Excepciones.Ejercicios;

import java.util.Scanner;

public class Ej4 {
    /*
     * Pide al usuario que ingrese una temperatura en grados Celsius
     *  y conviértela a Fahrenheit. Captura cualquier excepción de
     *  formato o lógica que ocurra.
     */

     public static void main(String[] args) {
        float celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce grados celsius");
        

        try {

            celsius = scanner.nextFloat();
            fahrenheit = (celsius * 9) / 5 + 32;
            System.out.println(fahrenheit);
        } catch (Exception e) {
            System.out.println("Ha habido un error");
            System.out.println(e.toString());
        }finally {
            System.out.println("Programa finalizado");
        }
        
     }

}
