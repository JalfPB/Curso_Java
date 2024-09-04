package Ejercicios4;

import java.util.Random;

public class Ej26 {
    //Simula una ruleta que gira y muestra un número aleatorio entre 0 y 36 hasta que salga el número 0.

    public static void main(String[] args) {
        int n;
        Random randomNumbers = new Random();
        do{
            n = randomNumbers.nextInt(37);
            System.out.println("El ruleta señala el numero " + n);
        }while(n!=0);
    }

}
