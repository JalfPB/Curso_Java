package Alamcenamiento_Datos.Repaso.Ejercicios.Ej2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce numero");
        int n = s.nextInt();
        int c = 0;
        for(int i = 1; i<=n; i++){
            if((n%i)==0){
                c++;
                System.out.println(c);
            }
        }
        if(c>2){
            System.out.println("El numero no es primo");
        }else{
            System.out.println("El numero es primo");
        }
    }

}
