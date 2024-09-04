package Ejercicios4;

public class Ej80 {
    // Escribe un método que reciba un array de cadenas y un número n, y devuelva
    // las cadenas con longitud mayor a n.

    static void compararCadenas(String[] lista, int n) {
        System.out.println("Las cadenas mayores que " + n + " son: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].length() > n) {
                System.out.println("- " + lista[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] cadenas = { "Hola", "Buenos dias", "Ola", "Hola Mundo" };

        compararCadenas(cadenas, 5);

    }

}
