package Ejercicios4;

import java.util.Scanner;

public class Ej18 {
    // Escribe un programa que evalúe la expresión matemática (suma, resta,
    // multiplicación, división) dependiendo del operador ingresado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2, total=0;
        char operador;

        System.out.println("Introduce primer numero del calculo");
        n1 = scanner.nextInt();

        System.out.println("Introduce operador");
        operador = scanner.next().charAt(0);

        System.out.println("Introduce segundo numero del calculo");
        n2 = scanner.nextInt();

        switch(operador){
            case '+':
                total = n1 + n2;
                break;
            case '-':
                total = n1 - n2;
                break;
            case '*':
                total = n1 * n2;
                break;
            case '/':
                total = n1 / n2;
                break;
            default:
                System.out.println("Operacion no reconocida");
                break;
        }

        System.out.println("El total de la operacion es " + total);
    }

}
