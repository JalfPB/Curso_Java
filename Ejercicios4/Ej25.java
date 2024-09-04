package Ejercicios4;

import java.util.Scanner;

public class Ej25 {

    public static void main(String[] args) {
        // Implementa una calculadora que realice operaciones básicas (suma, resta,
        // multiplicación, división) hasta que el usuario decida terminar.
        int opcion,n1,n2;
        Scanner scanner = new Scanner(System.in);
        boolean salir=false;
        
        do{
            System.out.println("Elige operacion");
            System.out.println("1 - Suma\n" +
                                "2 - Resta \n" + //
                                "3 - Multiplicacion\n" + //
                                "4 - Division\n" + //
                                "5 - Salir\n");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Introduce numero 1");
                    n1 = scanner.nextInt();
                    System.out.println("Introduce numero 2");
                    n2 = scanner.nextInt();
                    System.out.println("El resultado de la suma es: " + (n1+n2));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Introduce numero 1");
                    n1 = scanner.nextInt();
                    System.out.println("Introduce numero 2");
                    n2 = scanner.nextInt();
                    System.out.println("El resultado de la resta es: " + (n1-n2));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Introduce numero 1");
                    n1 = scanner.nextInt();
                    System.out.println("Introduce numero 2");
                    n2 = scanner.nextInt();
                    System.out.println("El resultado de la multiplicacion es: " + (n1*n2));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Introduce numero 1");
                    n1 = scanner.nextInt();
                    System.out.println("Introduce numero 2");
                    n2 = scanner.nextInt();
                    System.out.println("El resultado de la division es: " + (n1/n2));
                    System.out.println();

                    
                    break;
                case 5:
                    System.out.println("Has salido");
                    salir = true;
                    break;
                default:
                    System.out.println("No se reconoce la operacion");
                    break;

            }
        }while(!salir);
    }

}
