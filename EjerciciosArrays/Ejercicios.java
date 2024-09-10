package EjerciciosArrays;

import java.util.Arrays;

public class Ejercicios {

    static int[][] crearMatriz(int n) {
        int[][] m = new int[4][4];
        int c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = c++;
            }
        }
        return m;
    }

    static void imprimirMatriz(int[][] m) {
        for (int[] fila : m) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static void main(String[] args) {
        // Crea y carga una matriz de n filas por n columnas para n = 4
        // Debes usar los siguientes metodos
        // static int[][] crearMatriz(int n), para crear la matriz de tamaño n
        // static void imprimirMatriz(int[][] m) para mostrar el contenido
        // Piensda una solucion para imprimir la diagonal de forma invertida

        int[][] m = crearMatriz(4);
        imprimirMatriz(m);

        int[] dInv = new int[4];

        /*
         * for (int i = 0; i < m.length; i++) {
         * for (int j = 0; j < m[i].length; j++) {
         * 
         * if (i + j == m.length - 1) {
         * dInv[i] = m[i][j];
         * }
         * }
         * }
         */

        for (int i = 0; i < m.length; i++) {
            // Accede al primer elemento de la primera columna,
            // el segundo de la segunda, y asi sucesivamente.
            dInv[i] = m[i][i];
            // System.out.println("PRUEBA " + dInv[i]);
        }

        // Invertimos el array dInv para obtener la diagonal principal invertida
        for (int i = 0; i < dInv.length / 2; i++) {
            int aux = dInv[i];                      // Variable temporal
            dInv[i] = dInv[dInv.length - 1 - i];    // Se le da la vuelta
            dInv[dInv.length - 1 - i] = aux;        // al array
        }

        System.out.println("Diagonal invertida: ");
        System.out.println(Arrays.toString(dInv));

    }

}
