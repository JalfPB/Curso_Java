package Ejercicios4;

import java.util.Scanner;

public class Ej37 {
    //Modifica un array de números enteros reemplazando todos los valores negativos por cero.

    public static void main(String[] args) {
        int[] lista = {1,-2,3,-4,5,-6,7,-8,9,-10};
        Scanner scanner = new Scanner(System.in);

        //Se realiza el reemplazo
        for(int i = 0; i<lista.length; i++){
            if(lista[i]<0)
                lista[i] = 0;
        }

        //Se mjuestra por pantalla
        for(int i = 0; i <lista.length; i++){
            System.out.println(lista[i]);
        }
    }

}
