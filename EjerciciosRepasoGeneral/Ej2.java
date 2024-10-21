package EjerciciosRepasoGeneral;

public class Ej2 {
    /*
     * Crea un método recursivo que tome un array de enteros y devuelva la suma
     * de todos sus elementos. Usa un caso base para cuando el array tenga un
     * solo elemento.
     */
    static int sumaArray(int[] array) {
        return sumaArrayRecursiva(array, array.length - 1);
    }

    private static int sumaArrayRecursiva(int[] array, int indice) {
        if (indice == 0) {
            return array[0];
        }
        return array[indice] + sumaArrayRecursiva(array, indice - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        System.out.println(sumaArray(array));
    }
}
