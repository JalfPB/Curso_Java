package Ejercicios4;

import java.util.Random;
import java.util.Scanner;

public class Ej60 {
    // Mejora el juego de adivinanza de un número que se realizó en ejercicios
    // anteriores, añadiendo pistas como "Estás muy lejos", "Estás cerca", y "Estás
    // muy cerca".

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int numero, numSecreto=0;
        Scanner scanner = new Scanner(System.in);

        numSecreto = randomNumber.nextInt(100);

        System.out.println("Intenta averiguar el numero");
        do{
            numero = scanner.nextInt();
            if(numero==numSecreto){
                System.out.println("Has acertado");
            // Se hace el absoluto para controlar negativos y positivos y obtener la 
            // diferencia
            }else if(Math.abs((numSecreto-numero))>20){
                System.out.println("Estas muy lejos");
            }else if(Math.abs((numSecreto-numero))>=10 && Math.abs((numSecreto-numero))<=20){
                System.out.println("Estas cerca");
            }else if(Math.abs((numSecreto-numero))<10){
                System.out.println("Estas muy cerca");
            }

        }while(numero!=numSecreto);
    }

}
