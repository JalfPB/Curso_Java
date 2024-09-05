package Ejercicios4;

public class Ej39 {
    //Combina dos arrays en uno solo.

    public static void imprimirArray(int[][] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        int[] lista2 = {1,2,3,4,5,6,7,8,9,10};
        int[][] combinacion = {lista, lista2};

        for(int i = 0; i <combinacion.length; i++){
            for(int j = 0; j<combinacion[i].length;j++){
                System.out.println(combinacion[i][j]);
            }
        }
        imprimirArray(combinacion);
    }

}
