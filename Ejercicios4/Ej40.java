package Ejercicios4;

import java.util.Scanner;

public class Ej40 {

    //Solicita un valor y elimina la primera aparición de ese valor en un array.

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Introduce numero a borrar");
        n = scanner.nextInt();


        //Se busca la primera aparicion del valor y se rompe el bucle
        for(int i = 0; i <lista.length; i++){
            if(lista[i] == n){
                lista[i] = 0;
                break;
            }
        }

        imprimirArray(lista);

    }

}
