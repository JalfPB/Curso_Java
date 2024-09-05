package Ejercicios4;

public class Ej89 {
    // Escribe un método que reciba un array y lo divida en dos arrays: uno con los
    // números pares y otro con los impares.

    static int[][] separarPares(int[] lista) {
        int[] pares = new int[lista.length];
        int[] impares = new int[lista.length];
        int indicePares = 0; // Se crean los indices para ordenar los nuevos arrays
        int indiceImpares = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                pares[indicePares] = lista[i];
                indicePares++;
            } else {
                impares[indiceImpares] = lista[i];
                indiceImpares++;
            }

        }

        // Devuelvo un array que contiene los dos arrays dividos
        return new int[][] { pares, impares };

    }

    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[][] arraysDivididos = separarPares(lista);

        System.out.print("Primer array: ");
        for (int i : arraysDivididos[0]) {
            System.out.print(i + " ");
        }

        System.out.print("\nSegundo array: ");
        for (int i : arraysDivididos[1]) {
            System.out.print(i + " ");
        }
    }

}
