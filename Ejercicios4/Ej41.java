package Ejercicios4;

public class Ej41 {
    //Crea un nuevo array con los elementos del array original duplicados (cada elemento se repite).

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
        int[][] duplicados = {lista,lista};

        imprimirArray(duplicados);

    }

}
