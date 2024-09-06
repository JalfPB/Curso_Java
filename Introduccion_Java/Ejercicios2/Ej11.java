package Ejercicios2;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        //Escribe un algoritmo que dada una distancia en millas marinas la escriba en metros.
        float millas, metros;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numero de millas");
        millas = scanner.nextFloat();

        metros = millas * 1852.00f;
        System.out.println(millas + " millas son " + metros + " metros");
    }

}
