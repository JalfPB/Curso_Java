package Ejercicios2;

public class Ej21 {

    public static void main(String[] args) {
        // Escribe un algoritmo que imprima todos los números pares entre 1 y 20.
        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador == 2 || i == 1) {
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " no es primo");
            }
        }
    }
}
