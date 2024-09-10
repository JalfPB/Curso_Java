package EjerciciosArrays;

import java.util.Arrays;

public class Ejercicio3 {

    // A partir de ejercicio anterior mejorar el metodo para que funcione con
    // matrices irregulares

    /*
     * static boolean compararTamaño(int[][] a, int[][] b) {
     * if (a.length == b.length) {
     * for (int i = 0; i < a.length; i++) {
     * if (a[i].length != b[i].length)
     * return false;
     * }
     * return true;
     * }
     * return false;
     * }
     */

    static int[][] combinarTamano(int[][] a, int[][] b) {
        int filas;
        if (a.length > b.length) {
            filas = a.length;
        } else {
            filas = b.length;
        }
        int[][] m = new int[filas][];

        for (int i = 0; i < filas; i++) {

            //COMPROBACIONES
            if (i >= b.length) {                // si en b no existe
                int columnas = a[i].length;
                m[i] = new int[columnas];
            }  
            else if (i >= a.length) {           // si en a no existe
                int columnas = b[i].length;
                m[i] = new int[columnas];
            }
            else {                              // si en a y b existe
                int columnas;
                if (a[i].length > b[i].length) {
                    columnas = a[i].length;
                } else {
                    columnas = b[i].length;
                }
                m[i] = new int[columnas];
            }
        }
        return m;
    }

    static void compararMatrices(int[][] a, int[][] b) {
        int[][] m = combinarTamano(a, b);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                //COMPROBACIONES
                if (i >= b.length)      // si en b no existe
                    m[i][j] = a[i][j];
                
                else if (i >= a.length) // si en a no existe
                    m[i][j] = b[i][j];
                
                else {                  // si en a y b existe la fila
                    if (j >= b[i].length)   // si en b no existe la columna
                        m[i][j] = a[i][j];
                    else if (j >= a[i].length)  // si en a no existe la columna
                        m[i][j] = b[i][j];
                    else if (a[i][j] > b[i][j]) {   // si en a y en b existe la columna
                        m[i][j] = a[i][j];
                    } else {
                        m[i][j] = b[i][j];
                    }
                }
            }
        }

        for (int[] fila : m) {
            System.out.println(Arrays.toString(fila));
        }

    }

    /*
     * static void compararMatrices(int[][] a, int[][] b) {
     * int[][] m = new int[a.length][];
     * 
     * if (compararTamaño(a, b)) {
     * 
     * for (int i = 0; i < a.length; i++) {
     * m[i] = new int[a[i].length];
     * }
     * 
     * for (int i = 0; i < m.length; i++) {
     * for (int j = 0; j < m[i].length; j++) {
     * if (a[i][j] > b[i][j])
     * m[i][j] = a[i][j];
     * else
     * m[i][j] = b[i][j];
     * }
     * }
     * 
     * for (int[] fila : m) {
     * System.out.println(Arrays.toString(fila));
     * }
     * } else {
     * System.out.println("No se pueden comparar");
     * }
     * 
     * }
     */

    public static void main(String[] args) {
        int[][] a = { { 1, 24, 3, 86 }, { 3, 28, 1, 535, 67 } };
        int[][] b = { { 30, 2, 16 }, { 15, 2, 32, 483 } };

        compararMatrices(a, b);
    }

}
