package EjerciciosRepasoGeneral;

import java.util.Arrays;

public class Ej7 {
    /*
     * Implementa el algoritmo de ordenamiento por burbuja para ordenar un array
     * de enteros. Usa bucles y condicionales para realizar el intercambio de
     * elementos.
     */

    static int[] burbuja(int[] array) {
        int aux = 0;
        int c = 0;

        for (int i = 0; i < array.length; i++) {
            c = i + 1;
            for (int j = 1; j < (array.length - i); j++) {

                if (array[j - 1] > array[j]) {
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {8,4,6,9,2,7,4,9,4,5,6};

        System.out.println(Arrays.toString(burbuja(array)));


    }

}
