package Excepciones.Ejercicios;

import java.util.Scanner;

public class Ej2 {
    /*
     * 	Programa que pida al usuario que ingrese un número como cadena.
     *  Intenta convertirlo a un entero y maneja la excepción NumberFormatException.
     */
    public static void main(String[] args) {
        String cadena;
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce cadena que introducir a numero entero");

        try{
            cadena = scanner.nextLine();
            numero = Integer.parseInt(cadena);
            System.out.println(numero);
        } catch (NumberFormatException e){
            System.out.println("Error al transformar la cadena a entero");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
        }
    }

}
