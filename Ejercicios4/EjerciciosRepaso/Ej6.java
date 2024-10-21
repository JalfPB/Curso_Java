package Ejercicios4.EjerciciosRepaso;

public class Ej6 {
    /*
     * Crea un metodo que a partir de una matriz de enteros, obtenga un array con
     * los
     * elementos máximos en cada una de las columnas de la matriz. Hacer lo mismo
     * para
     * cada una de las filas.
     */



    static void obtenerMaximos(int[][] matriz) {
        int filMax = 0;
        int[] colMax = new int[matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > filMax) filMax = matriz[i][j];
            }
            System.out.println("El numero mas grande de la fila "+ (i + 1) + " es " + filMax);

        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > colMax[j]) {
                    colMax[j] = matriz[i][j];
                }
            }
        }

        for(int i = 0; i < colMax.length; i++){
            System.out.println("El maximo de la columna " + (i + 1) + " es " + colMax[i]);
        }

    }

    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4},
                          {2,1,4,3},
                          {24,5,6,7}};

        obtenerMaximos(matriz);
    }

}
