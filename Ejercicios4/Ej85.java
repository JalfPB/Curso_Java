package Ejercicios4;

public class Ej85 {
    //Implementa un método que divida un array en dos arrays de tamaños iguales (o casi iguales si el tamaño es impar).

    static int[][] dividirArray(int[] array) {
        int n = array.length;
        int mitad = n / 2;

        int[] primerArray = new int[mitad];         // Calcular el tamaño de los nuevos
        int[] segundoArray = new int[n - mitad];    // Arrays

        for (int i = 0; i < mitad; i++) {
            primerArray[i] = array[i];
        }

        for (int i = mitad; i < n; i++) {
            segundoArray[i - mitad] = array[i];
        }

        return new int[][]{primerArray, segundoArray};
    }
    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[][] arraysDivididos = dividirArray(lista);

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
