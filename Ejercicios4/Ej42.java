package Ejercicios4;
import java.util.Scanner;

public class Ej42 {
    //Multiplica todos los elementos de un array por un valor dado.

    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero");
        num = scanner.nextInt();

        for(int i = 0; i <lista.length; i++){
            System.out.println(lista[i] + " * " + num + " = " + lista[i]*num);
        }
    }

}
