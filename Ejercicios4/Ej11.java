package Ejercicios4;

import java.util.Scanner;

public class Ej11 {
    //Escribe un programa que compare las longitudes de dos palabras y diga cuál es más larga.
    static void compararCadenas(String s1, String s2){
        int longitud1, longitud2;

        longitud1=s1.length();
        longitud2=s2.length();

        if(longitud1>longitud2){
            System.out.println("La primera cadena es mas larga");
        }else if(longitud1<longitud2){
            System.out.println("La segunda cadena es mas larga");
        }else{
            System.out.println("Son iguales");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;

        System.out.println("Introduce primera cadena");
        s1 = scanner.nextLine();
        System.out.println("Introduce segunda cadena");
        s2 = scanner.nextLine();

        compararCadenas(s1, s2);

    }

}
