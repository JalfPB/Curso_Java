package Ejercicios4;

import java.util.Scanner;

public class Ej24 {
    //Suma números ingresados por el usuario, pero solo si son múltiplos de 4.
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Introduce numero para la suma");
            n = sc.nextInt();
            if(n%4==0){
                sum += n;
                System.out.println("Suma: " + sum);
            }else{
                System.out.println("No es multiplo de 4");
            }
        }
    }

}
