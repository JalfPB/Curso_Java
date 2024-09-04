package Ejercicios4;

public class eJ84 {
    // Crea un método que reciba un array de enteros y devuelva un nuevo array con
    // solo los números primos.

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

    static int[] primos(int[] lista) {
        int[] primos = new int[lista.length];
        int indicePrimos = 0;

        for (int i = 0; i < lista.length; i++) {
            int contador = 0;
            for (int j = 1; j <= lista[i]; j++) {
                if (lista[i] % j == 0) {
                    contador++;
                }
            }
            if (contador <= 2) {
                primos[indicePrimos] = lista[i];
                indicePrimos++;
            }
        }
        return primos;
    }

    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        imprimirArray(primos(lista));
    }

}
