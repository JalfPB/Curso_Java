package Ejercicios4.EjerciciosRepaso;

public class Ej7 {
    /*
     * Crea un método que imprima una matriz invertida de otra matriz
     */

     static int[][] invertirMatriz(int[][] matriz){
        int[][] transpuesta = new int[matriz[0].length][matriz.length]; 
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                transpuesta[j][i] = matriz[i][j];
            }
     }
     return transpuesta;
    }

    public static void imprimirArray(int matriz[][])
    {
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},
                          {4,5,6}};
                          
        imprimirArray(invertirMatriz(matriz));
    }
}
