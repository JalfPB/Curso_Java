package Ejercicios4;

public class Ej53 {
    //Elimina los primeros y últimos elementos de un array si ambos son impares.

        public static void main(String[] args) {
            int[] lista = {9, 2, 3, 4, 5, 6, 7, 8, 11};
    
            // Verifica si el primer y último elemento son impares
            if (lista.length > 1 && lista[0] % 2 != 0 && lista[lista.length - 1] % 2 != 0) {
                // Crear un nuevo array excluyendo el primer y último elemento
                int[] nuevaLista = new int[lista.length - 2];
                for (int i = 1; i < lista.length - 1; i++) {
                    nuevaLista[i - 1] = lista[i];
                }
                System.out.print("Array modificado: ");
                imprimirArray(nuevaLista);
            } else {
                System.out.print("Array original: ");
                imprimirArray(lista);
            }
        }
    
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
    }
