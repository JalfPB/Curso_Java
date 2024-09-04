package Ejercicios4;

import java.util.Scanner;

public class Ej34 {
    //Solicita al usuario un número y busca ese número en un array. Indica si el número está presente o no.

    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        boolean existe = false;

        System.out.println("Numero a buscar");
        int n = scanner.nextInt();

        //Se recorre el array en busca del numero introducido
        for(int i = 0; i<lista.length; i++){
            if(n==lista[i]){
                existe = true;
            }
        }

        if(existe){
            System.out.println("El numero se encuentra dentro del array");
        }else{
            System.out.println("El numero no se encuentra dentro del array");
        }

    }

}
