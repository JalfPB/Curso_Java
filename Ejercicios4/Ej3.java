package Ejercicios4;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Escribe un programa que compare dos cadenas de texto y determine si son iguales o diferentes.
        String s1, s2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce primera cadena");
        s1 = scanner.nextLine();
        System.out.println("Introduce segunda cadena");
        s2 = scanner.nextLine();

        if(s1.equals(s2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }

    }

}
