package Ejercicios4;

import java.util.Random;
import java.util.Scanner;

public class Ej65 {
    // Simula un lanzamiento de moneda (cara o cruz) hasta que el usuario decida
    // parar. Cuenta cuántas veces salió cada resultado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, cara=0,cruz=0;
        boolean parar = false;
        Random randomNumber = new Random();

        do{

            n = randomNumber.nextInt(2);
            System.out.println(n);

            switch (n) {
                case 0:
                    System.out.println("Ha salido cara");
                    cara++;
                    break;

                case 1:
                    System.out.println("Ha salido cruz");
                    cruz++;
                    break;
            
                default:
                    break;
            }

            System.out.println("Continuar? Si/No");

            if(scanner.nextLine().toLowerCase().equals("no")){
                parar = true;
            }
            
        }while(!parar);

        System.out.println("Cara ha salido " + cara + " veces y cruz ha salido " + cruz + " veces");

    }

}
