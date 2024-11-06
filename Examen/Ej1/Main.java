package Examen.Ej1;

import java.util.Scanner;

public class Main {
    /*
     * Crea un programa que haga lo siguiente:
        Declare un array de enteros de tamaño 5.
        Pida al usuario ingresar 5 números y almacénelos en el array.
        Copia el contenido del array en otro array utilizando un bucle.
        Crea un método calcularPromedio(int[] arr) que reciba un array y devuelva el promedio de los números.
        Imprime el promedio calculado.
     */

    // Metodo para calcular la media
    public static int calcularPromedio(int[] arr){
        int suma = 0;
        int media = 0;
        for(int i = 0; i < arr.length; i++){
            suma += arr[i];
        }

        media = suma / arr.length;

        return media;
    }

    public static void main(String[] args) {
        int[] lista = new int[5];
        int[] listaCopia = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 5 numeros");

        // Bucle que recoge los numeros y los inserta en el array
        for(int i = 0; i < 5; i++){
            int n = scanner.nextInt();
            lista[i] = n;
        }

        // Bucle que copia el array
        for(int i = 0; i < lista.length; i++){
            listaCopia[i] = lista[i];
        }

        System.out.println("Promedio: " + calcularPromedio(listaCopia));
        scanner.close();
    }

}
