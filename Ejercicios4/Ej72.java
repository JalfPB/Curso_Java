package Ejercicios4;

public class Ej72 {
    // Implementa un programa que rote los elementos de un array una posición a la
    // izquierda.

    // Método para rotar los elementos del array una posición a la izquierda
    public static void rotarIzquierda(int[] array) {
        if (array.length > 0) {
            int primero = array[0]; // Guardar el primer elemento

            // Desplazar todos los elementos una posición a la izquierda
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Colocar el primer elemento al final del array
            array[array.length - 1] = primero;
        }
    }

    // Método para imprimir el array
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
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.print("Array original: ");
        imprimirArray(lista);

        // Rotar el array a la izquierda
        rotarIzquierda(lista);

        // Mostrar el array rotado
        System.out.print("Array después de rotar a la izquierda: ");
        imprimirArray(lista);
    }

}
