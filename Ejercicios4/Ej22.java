package Ejercicios4;

import java.util.Scanner;

public class Ej22 {
    //Determina si un número es perfecto (la suma de sus divisores propios es igual al número).

    public static void main(String[] args) {
        int num = 0, suma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero");
        num = scanner.nextInt();

        for(int i = 1; i <num; i++){
            if(num%i==0){
                suma+=i;
            }
        }
        
        if(suma==num){
            System.out.println(num + " es perfecto");
        }else{
            System.out.println(num + " no es perfecto");
        }
    }

}
