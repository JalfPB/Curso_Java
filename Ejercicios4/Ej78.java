package Ejercicios4;

public class Ej78 {
    // Crea un método que reciba un array de enteros y devuelva la suma de sus
    // elementos.

    static int sumaArray(int[] lista) {
        int suma = 0;

        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }

        return suma;
    }

    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("La suma de la lista da " + sumaArray(lista));

    }

}
