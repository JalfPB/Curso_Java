package Ejercicios4.EjerciciosRepaso;

import java.util.Arrays;
import java.util.Random;

public class Ej4 {
    /*Un generador de matrices aleatorias, que sea capaz de crear una matriz
     * cuadrada, se deberá pasar el tamaño de la matriz como parametro y el valor
     * maximo que podra tener cada uno de los elementos de la matrix
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

    static int[][] generadorMatriz(int tamano, int valorMax){
        Random randomNumbers = new Random();

        int[][] matriz = new int[tamano][tamano];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = randomNumbers.nextInt(valorMax+1);
            }
        }

        return matriz;

    }

    public static void main(String[] args) {
        int[][] matriz = generadorMatriz(3, 5);

        imprimirArray(matriz);
    }
}
