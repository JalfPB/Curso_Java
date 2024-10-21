package Ejercicios4.EjerciciosRepaso;

import java.util.Random;

public class Ej5 {

    /* Ampliar el metodo anterior para que sea capaz de generar una matriz irregular.
     * Para ello deberemos añadir parámetros adicionales con la cantidad mínima y máxima
     * de filas, y la cantidad mínima y máxima de columnas. se debe tener en cuenta que 
     * cada fila podrá tener una cantidad distinta de elementos.
     */

     public static void imprimirArray(int matriz[][])
    {
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generadorMatriz(int minCol, int maxCol,int minFil, int maxFil, int valorMax){
        Random randomNumbers = new Random();
        int columnas = randomNumbers.nextInt(maxCol + minCol);
        int filas = randomNumbers.nextInt(maxFil + minFil);

        int[][] matriz = new int[columnas][filas];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = randomNumbers.nextInt(valorMax+1);
            }
        }

        return matriz;

    }

    public static void main(String[] args) {
        int[][] matriz = generadorMatriz(3, 5,3,5,5);

        imprimirArray(matriz);
    }

}
