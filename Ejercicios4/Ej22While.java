package Ejercicios4;
import java.util.Scanner;

public class Ej22While {

    public static void main(String[] args) {
        int num = 0, suma = 0, i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero");
        num = scanner.nextInt();

        while(i < num) {
            if(num % i == 0) {
                suma += i;
            }
            i++;
        }
        
        if(suma==num){
            System.out.println(num + " es perfecto");
        }else{
            System.out.println(num + " no es perfecto");
        }
    }

}
