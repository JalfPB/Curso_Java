package Ejercicios4;
import java.util.Scanner;

public class Ej51 {
    //Crea un array con números y genera otro array que solo contenga números mayores a un valor dado por el usuario con los  valores de la primera lista.

    public static void main(String[] args) {
        int[] lista = { 1, 1, 2, 3, 4, 4, 10, 6, 7, 8, 8 };
        int[] lista2 = new int[lista.length];
        Scanner scanner = new Scanner(System.in);
        int num, indice=0;

        System.out.println("Introduce numero");
        num = scanner.nextInt();

        for(int i = 0; i<lista2.length; i++){
            if(lista[i]>num){
                lista2[indice] = lista[i];
                indice++;
            }
        }

        System.out.println("Los contenidos de la segunda lista son: ");

        for(int i = 0; i<lista2.length; i++){
            System.out.println(lista2[i]);;
        }

    }

}
