package Ejercicios4.EjerciciosRepaso;

public class Ej2 {

    static void compararCadenas(String[] lista) {
        int max = 0;
        String sMax = "";
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].length() > max) {
                max = lista[i].length();
                sMax = lista[i];
            }
        }
        System.out.println("La cadena mas larga es: " + sMax);
    }

    public static void main(String[] args) {
        String[] cadenas = { "Hola", "Buenos dias || tardes || noches", "Ola", "Hola Mundo" };

        compararCadenas(cadenas);

    }

}
