package Ejercicios4;

import java.util.Scanner;

public class Ej81 {
    // Escribe un método que reciba una matriz cuadrada y devuelva la suma de los
    // elementos de sus diagonales.

    static int sumaDiagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    static void mostrarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int filas = 3, columnas = 3;
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduce numero para la posicion [" + i + "] [" + j + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }

        mostrarMatriz(matriz, filas, columnas);

        System.out.println("La suma de las diagonales de la matriz es: " + sumaDiagonal(matriz));

    }

}

// matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
// "Digita un número para la posición: a[" + i + "][" + j + "]" + " de la matriz
// A"));
