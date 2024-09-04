package Ejercicios4;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        // Escribe un programa que lea tres números introducidos por el usuario y determine cuál es el mayor.
        Scanner scanner = new Scanner(System.in);
        int n = 0, max = 0, min = 0;

        for (int i = 1; i<=3; i++){
            System.out.println("Introduce num " + i);
            n = scanner.nextInt();
            if(i==1){
                max=n;
                min=n;
            }else{
                if(n>max){
                    max = n;
                }else if(n<min){
                    min = n;
                }
            }
        }
    System.out.println("El número mayor es " + max + " y el menor es " + min);
    }

}
