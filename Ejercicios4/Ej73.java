package Ejercicios4;

public class Ej73 {
    // Llena un array y elimina los valores duplicados, dejando solo las ocurrencias
    // únicas en el array.

    // Método para imprimir el array
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

    public static int[] sinRepetir(int[] a) {
        int len = a.length;
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[len - 1];
        int[] c = new int[j];
        for (int k = 0; k < j; k++) {
            c[k] = a[k];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] lista = { 1, 1, 2, 2, 3, 3, 4, 5, 6, 7};

        sinRepetir(lista);

        imprimirArray(lista);
    }

}
