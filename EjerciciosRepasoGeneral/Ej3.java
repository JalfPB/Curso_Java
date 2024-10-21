package EjerciciosRepasoGeneral;

public class Ej3 {
    /*
     * 3- Implementa un método que utilice búsqueda binaria de forma recursiva.
     *  El método debe recibir un array ordenado y un número a buscar, y debe
     *  devolver el índice donde se encuentra o -1 si no está presente.
     */

     static int busquedaBinaria(int[] array, int numObjetivo, int izq, int der) {
        if (izq > der) {
            return -1;
        }

        int medio = izq + (der - izq) / 2;

        if (array[medio] == numObjetivo) {
            return medio;
        }

        // Si el numObjetivo es menor que el medio
        if (numObjetivo < array[medio]) {
            return busquedaBinaria(array, numObjetivo, izq, medio - 1);
        }

        // Si el numObjetivo es mayor que el medio
        return busquedaBinaria(array, numObjetivo, medio + 1, der);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numObjetivo = 5;

        int resultado = busquedaBinaria(array, numObjetivo, 0, array.length - 1);
        if (resultado != -1) {
            System.out.println("Numero encontrado en la posicion: " + resultado);
        } else {
            System.out.println("Numero no encontrado");
        }
    }

}
