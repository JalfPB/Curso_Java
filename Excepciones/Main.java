package Excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 0;
        // int cociente = dividendo/divisor;
        int cociente;

        if (divisor != 0)
            cociente = dividendo / divisor;
        else
            System.out.println("Error");

        // Controlar Excepcion
        try {
            FileReader file = new FileReader("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

        // bloque1
        try {
            // bloque2
        } catch (ArithmeticException e) {
            // bloque3
        } catch (NullPointerException e) {
            // bloque4
        }
        // bloque5

        try {
            int num = Integer.parseInt("Hola");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("El formato del numero es incorrecto");
        }

        /*
         * try{
         * 
         * }catch(TipoException1 e1){
         * System.out.println("El error es: " + e1.getMessage);
         * }catch(TipoException e2){
         * System.out.println("El error es: " + e2.getMessage);
         * }catch(TipoException e3){
         * System.out.println("El error es: " + e3.getMessage);
         * }
         */

        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Fin del programa");
        }
    }

}
