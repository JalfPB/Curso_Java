package Ejercicios4;
import java.util.Random;

public class Ej26For {

    public static void main(String[] args) {
        int n;
        Random randomNumbers = new Random();
        for (;;) { // Bucle infinito
            n = randomNumbers.nextInt(37);
            System.out.println("El ruleta señala el numero " + n);
            
            if (n == 0) {
                break; // Salimos del bucle si n es igual a 0
            }
        }
    }

}
