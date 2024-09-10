package EjerciciosArrays;

import java.util.Arrays;

public class Ejercicio2 {

    // Crea un metodo que dadas dos matrices a y b, las compare elemento a elemento
    // y
    // muestre otra matriz m. dicha matriz debe tener el valor maximo en cada una de
    // las posiciones.
    // las matrices se deben pasar como parámetros al metodo y deben ser exactamente
    // iguales. tanto en filas, como en elementos de cada fila. por ejemplo ...
    // si las matrices no son iguales, se debe mostrar un mensaje diciendo que no se
    // pueden comparar

    static boolean compararTamaño(int[][] a, int[][] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i].length != b[i].length)
                    return false;
            }
            return true;
        }
        return false;
    }

    static void compararMatrices(int[][] a, int[][] b) {
        int[][] m = new int[a.length][];

        if (compararTamaño(a, b)) {

            for (int i = 0; i < a.length; i++) {
                m[i] = new int[a[i].length];
            }

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (a[i][j] > b[i][j])
                        m[i][j] = a[i][j];
                    else
                        m[i][j] = b[i][j];
                }
            }

            for (int[] fila : m) {
                System.out.println(Arrays.toString(fila));
            }
        } else {
            System.out.println("No se pueden comparar");
        }

    }

    public static void main(String[] args) {
        int[][] a = { { 1, 24, 3 }, { 3, 28, 1 } };
        int[][] b = { { 30, 2, 16 }, { 15, 2, 32 } };

        compararMatrices(a, b);
    }

}
