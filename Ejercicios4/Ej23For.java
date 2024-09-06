package Ejercicios4;

public class Ej23For {

    public static void main(String[] args) {

        int num = 10;
        String stringBinario = "";

        for (; num != 0; num /= 2) {
            stringBinario = (num % 2) + stringBinario; // Concatenar el bit al principio de la cadena
        }

        System.out.println("El binario es: " + stringBinario);

    }

}
