package Examen.Ej2;

import java.util.Random;

public class Main {
    /*
     * Problema: Crea una matriz irregular de enteros con tres filas, donde la primera fila tenga 2 columnas, la segunda fila 3 columnas y la tercera fila 4 columnas. Llena la matriz con números aleatorios entre 1 y 20.
        Ordena cada fila individualmente.
        Imprime la matriz antes y después de la ordenación.
     */

    // Metodo para mostrar la matriz
    static void mostrarMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Metodo para ordenar con el metodo de la burbuja un array
    static int[] burbuja(int[] vector) {
        int aux;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                // El valor maximo lo más a la derecha posible
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        return vector;
    }

    // Se aplica burbuja a cada fila de la matriz
    static int[][] ordenarMatriz(int[][] matriz){

        for(int i = 0; i < matriz.length; i++){
            matriz[i] = burbuja(matriz[i]);
        }

        return matriz;
    }

    public static void main(String[] args) {
        int[][] matriz = {{0,0}, {0,0,0}, {0,0,0,0}};
        Random random = new Random();

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                // Se asigna un numero aleatorio a cada posicion de la matriz
                matriz[i][j] = random.nextInt(20);
            }
        }

        System.out.println("Matriz antes de ordenar");
        mostrarMatriz(matriz);

        matriz = ordenarMatriz(matriz);
        System.out.println("Matriz despues de ordenar");
        mostrarMatriz(matriz);


    }

}
