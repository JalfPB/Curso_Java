package Ejercicios4;

public class Ej39 {
    //Combina dos arrays en uno solo.

    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        int[] lista2 = {1,2,3,4,5,6,7,8,9,10};
        int[][] combinacion = {lista, lista2};

        for(int i = 0; i <combinacion.length; i++){
            for(int j = 0; j<combinacion[i].length;j++){
                System.out.println(combinacion[i][j]);
            }
        }

        /*for(int i= 0; i<combinacion.length;i++){
            for(int j= 0; j<combinacion[i].length;j++){
                combinacion[j][i] = lista[i];
            }
        }

        for(int i = 0; i <combinacion.length; i++){
            for(int j = 0; j<combinacion[i].length;j++){
                System.out.println(combinacion[i][j]);
            }
        }*/

    }

}
