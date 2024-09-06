package Ejercicios2;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        //    8- Algoritmo que pida un número y en función a ese número haga un triangulo rectángulo cuya altura sea el número introducido, de la siguiente forma:
        //        *
        //        **
        //        ***
        //        ****
        //        *****
        System.out.println("Introduce altura");
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();
        for(int i=1;i<=altura;i++){
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.println(' ');
        }
    }

}
