package Ejercicios2;

import java.util.Scanner;

public class Ej26 {

    public static void main(String[] args) {
        //Escribe un algoritmo que pida números al usuario hasta que ingrese el número 0. Al final, debe mostrar cuántos números fueron ingresados (excluyendo el 0).

        Scanner scanner = new Scanner(System.in);
        int n, contador=0;
        String numeros = "";

        do{
            System.out.println("Introduce numero");
            n = scanner.nextInt();
            if(n!=0)
            contador++;
            numeros = numeros + " , " + n;
        }while(n!=0);

        System.out.println("Los numeros introducidos son: \n" +  numeros);
        System.out.println("han sido ingresados " + contador + " numeros");

    }

}
