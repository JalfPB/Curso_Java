package Ejercicios4;

import java.util.Scanner;

public class Ej30 {
    // Realiza una cuenta regresiva de un número ingresado por el usuario y muestra
    // "¡Tiempo!" al llegar a cero.

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero");
        n = scanner.nextInt();
        
        for(int i = n; i>=0; i--){
            if(i==0){
                System.out.println("TIEMPO!");
            }else{
            System.out.println(i);
        }
        }
    }
}
