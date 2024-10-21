package EjerciciosRepasoGeneral;

import java.util.Arrays;

public class Ej4 {

    /*
     * 4- Escribe un método que tome un array y lo invierta. Usa bucles para intercambiar
     *  los elementos y condicionales para controlar el intercambio.
     */

     static int[] invertirArray(int[] array){

        for (int i = 0; i < array.length/2; i++) {
            int a = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = a;
        }

        return array;

     }

     public static void main(String[] args) {
        int[] array = {1,2,3};

        System.out.println(Arrays.toString(invertirArray(array)));


     }

}
