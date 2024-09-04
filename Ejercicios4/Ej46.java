package Ejercicios4;
import java.util.Scanner;

public class Ej46 {
    //Solicita al usuario una lista de números y utiliza un array para almacenar los números. Suma solo los números positivos.

    public static void main(String[] args) {
        int[] lista = new int[10];
        Scanner scanner = new Scanner(System.in);
        int num = 0, suma = 0;

        for(int i = 0; i <lista.length; i++){
            System.out.println("Introduce numero");
            num = scanner.nextInt();
            lista[i] = num;
            if(num>0){
                suma+=num;
            }
        }

        System.out.println("El resultado de la suma es: " + suma);
    }


}
