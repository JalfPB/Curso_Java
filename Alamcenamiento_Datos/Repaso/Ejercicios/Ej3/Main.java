package Alamcenamiento_Datos.Repaso.Ejercicios.Ej3;

import java.util.Scanner;

public class Main {
    static int sumarHastaN(int n){
        int suma = 0;
        for(int i = 0; i <= n; i++){
            suma += i;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce numero");
        int n = s.nextInt();
        System.out.println("La suma de todos los numero hasta " + n + " es " + sumarHastaN(n));
    }

}
