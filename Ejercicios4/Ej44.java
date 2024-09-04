package Ejercicios4;

public class Ej44 {
    // Ingresa dos arrays y después une ambos manteniendo el orden.

    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] lista2 = { 1, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        // Creo una tercera lista donde estaran concatenados los dos anteriores
        int[] listaConcat = new int[lista.length + lista2.length];
        int indice = 0;

        System.out.println("\nArreglo A: ");
        for (int i = 0; i < lista.length; i++) {
            listaConcat[indice++] = lista[i];
        }

        System.out.println("\nArreglo B: ");
        for (int i = 0; i < lista2.length; i++) {
            listaConcat[indice++] = lista2[i];
        }

        for(int i = 0; i < listaConcat.length; i++){
            System.out.println(listaConcat[i]);
        }

    }
}
