package Ejercicios2;

import java.util.Scanner;

public class Ej27 {

    public static void main(String[] args) {
        // Escribe un algoritmo que genere un número secreto (por ejemplo, 7) y permita al usuario intentar adivinarlo.
        // El algoritmo debe continuar pidiendo números al usuario hasta que adivine el número secreto, mostrando
        // si el número ingresado es mayor o menor que el número secreto.

        Scanner scanner = new Scanner(System.in);
        double n, nSecreto;
        boolean acierto=false;

        nSecreto=Math.random()*10;
        nSecreto=(int)nSecreto;
        System.out.println(nSecreto);

        do{
            System.out.println("Intenta adivinar el numero secreto");
            n = scanner.nextInt();
            if(n>nSecreto){
                System.out.println("El numero es mayor que el numero secreto");
            }else if(n<nSecreto){
                System.out.println("El numero es menor que el numero secreto");
            }
            if(n==nSecreto){
                System.out.println("Has acertado");
                acierto=true;
            }
        }while(!acierto);
    }

}
