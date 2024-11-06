package Datos_Colecciones.Ejercicios2.Ej2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
     * Implementa un programa que use una pila para convertir un
     * número decimal a binario, octal o hexadecimal.
     */

     static void binario(int num){
        Stack pilaBinaria = new Stack<>();

        while (num > 0) {
            int r = num % 2;

            pilaBinaria.push(r);
            num /= 2;
        }

        System.out.print("En binario: ");

        while (!(pilaBinaria.isEmpty())) {
            System.out.print(pilaBinaria.pop());
        }
     }

     static void octal(int num){

        Stack pilaOctal = new Stack<>();

        while (num > 0) {
            int digit = num % 8;
            pilaOctal.push(digit);
            num = num / 8;
        }

        System.out.println("\nEn Octal: ");
        while (!(pilaOctal.isEmpty())) {
            System.out.print(pilaOctal.pop());
        }
     }

     static void hexadecimal(int num){
        
        Stack<Integer> hexNum = new Stack();

        int i = 0;
        while (num != 0) {


            hexNum.push(num % 16);
            num = num / 16;
            i++;
        }

        System.out.println("\nEn hexadecimal: ");

        while(!hexNum.isEmpty()) {
            if (hexNum.peek() > 9)
                System.out.print((char)(55 + hexNum.pop()));
            else
                System.out.print(hexNum.pop());
        }
    
     }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero decimal: ");
        int num = scanner.nextInt();

        binario(num);

        octal(num);

        hexadecimal(num);

    }

}
