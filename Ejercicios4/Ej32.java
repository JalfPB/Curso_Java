package Ejercicios4;

import java.util.Scanner;

public class Ej32 {
    // Convierte un número de segundos ingresado por el usuario en horas, minutos y
    // segundos hasta que se ingrese un valor negativo.

    public static void main(String[] args) {
        int n, horas, minutos, segundos;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Introduce segundos");
            n = scanner.nextInt();
            minutos = n/60;
            horas = minutos/60;
            System.out.println(n + " segundos son " + minutos + " minutos y " + horas + " horas");
        }while(n>=0);
    }

}
