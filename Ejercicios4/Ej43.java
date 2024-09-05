package Ejercicios4;

public class Ej43 {
    //Suma dos arrays y guarda el resultado en una tercera matriz.
    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        int[] lista2 = {1,12,13,14,15,16,17,18,19,20};
        int[] suma = new int[10];

        for(int i = 0; i < lista.length; i++){
            suma[i] = lista[i]+lista2[i];
        }

        imprimirArray(suma);
    }

}
