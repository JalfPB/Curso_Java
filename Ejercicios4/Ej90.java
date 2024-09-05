package Ejercicios4;

public class Ej90 {
    // Escribe un método que sume los elementos de un array en posiciones que son
    // múltiplos de un número dado n.

    static int sumarMultiplos(int[] lista, int multiplo) {
        int suma = 0;

        for (int i = 0; i < lista.length; i++) {
            if (i % multiplo == 0) { //Se comprueba que elo indice sea multiplo
                suma += lista[i];
            }
        }

        return suma;

    }

    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int multiplo = 2;

        System.out.println(
                "La suma de el array de los numero multiplo de " + multiplo + " es " + sumarMultiplos(lista, multiplo));
    }

}
