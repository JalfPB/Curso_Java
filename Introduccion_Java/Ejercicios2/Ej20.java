package Ejercicios2;

import java.util.Scanner;

public class Ej20 {

    public static void main(String[] args) {
        //Escribe un algoritmo que solicite la edad de una persona y muestre si es un "Niño" (0-12 años), "Adolescente" (13-17 años), "Adulto" (18-64 años) o "Adulto mayor" (65 años o más).
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce Edad");
        edad = scanner.nextInt();

        if(edad<=12){
            System.out.println("Niño");
        }else if(edad>=13 && edad <=17){
            System.out.println("Adolescente");
        }else if(edad>=18 && edad <=64){
            System.out.println("Adulto");
        }else{
            System.out.println("Adulto Mayor");
        }
    }

}
