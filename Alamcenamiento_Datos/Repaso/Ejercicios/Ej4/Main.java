package Alamcenamiento_Datos.Repaso.Ejercicios.Ej4;

import java.util.Scanner;

public class Main {

    static void primo(){
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

    static int factorialRecursivo(int n){
        if (n > 1){
            return n * factorialRecursivo(n-1);
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion = 1;

        while(opcion!=3){
            System.out.println("Elige opcion:");
            System.out.println("1. Calcular factorial");
            System.out.println("2. Verificar numero primo");
            System.out.println("3. Salir");

            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce numero");
                    int num = s.nextInt();
                    System.out.println("El factorial de " + num + " es "+ factorialRecursivo(num));
                    break;
                case 2:
                    primo();
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }

}
