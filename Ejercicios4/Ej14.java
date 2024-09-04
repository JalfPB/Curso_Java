package Ejercicios4;

import java.util.Scanner;

public class Ej14 {
    //Dados tres números, determina si alguno de ellos es igual a la suma de los otros dos.

    static void comprobarNums(int n1, int n2, int n3){
        if(n1+n2==n3){
            System.out.println("La suma de " + n1 + " + " + n2 + " da " + n3);
        }

        else if(n1+n3==n2){
            System.out.println("La suma de " + n1 + " + " + n3 + " da " + n2);

        }

        else if(n2+n3==n1){
            System.out.println("La suma de " + n2 + " + " + n3 + " da " + n1);
        }

        else{
            System.out.println("Ningun numero es igual a la suma de los otros dos");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Introduce 3 numeros");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        comprobarNums(n1, n2, n3);
    }

}
