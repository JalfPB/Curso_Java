package Ejercicios4;

public class Ej71 {
    // Rellena un array con las 10 primeras posiciones de la serie de Fibonacci. Los
    // números de la serie de Fibonacci se deben calcular de forma automática.

    static int fibonacci(int max) {

        int primero = 0;
        int segundo = 1;
        int fibonacci = '\0';

        for (int i = 2; i < max; i++) {

            fibonacci = primero + segundo;      // Metodo para calcular 
                                                // Fibonacci
            primero = segundo;
            segundo = fibonacci;
        }

        return fibonacci;
    }

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] lista = new int[10];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = fibonacci(i+2);
        }

        imprimirArray(lista);

    }

}
