package Ejercicios4;

public class Ej44 {
    // Ingresa dos arrays y después une ambos manteniendo el orden.

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
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] lista2 = { 1, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        // Creo una tercera lista donde estaran concatenados los dos anteriores
        int[] listaConcat = new int[lista.length + lista2.length];
        int indice = 0;

        //Primera lista
        for (int i = 0; i < lista.length; i++) {
            listaConcat[indice++] = lista[i];
        }

        //Segunda lista
        for (int i = 0; i < lista2.length; i++) {
            listaConcat[indice++] = lista2[i];
        }

        imprimirArray(listaConcat);

    }
}
