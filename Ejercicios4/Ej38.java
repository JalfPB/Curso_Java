package Ejercicios4;

import java.util.Scanner;

public class Ej38 {

    public static void main(String[] args) {
        //Invierte el orden de los elementos en un array.
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[10];
        int j = lista.length;
        
        //Se crea un array con los numeros en reversa
        for (int i = 0; i < lista.length; i++) { 
            b[j - 1] = lista[i]; 
            j = j - 1; 
        }

        //Se mjuestra por pantalla
        for(int i = 0; i <lista.length; i++){
            System.out.println(lista[i]);
        }

        for(int i = 0; i <lista.length; i++){
            System.out.println(b[i]);
        }
    }

}
