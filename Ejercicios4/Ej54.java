package Ejercicios4;
import java.util.Scanner;

public class Ej54 {
    //Crea un menú simple con opciones como sumar, restar, multiplicar y dividir. Se repetirá hasta que el usuario escriba salir.

    public static void main(String[] args) {
        
        int n1,n2;
        Scanner scanner = new Scanner(System.in);
        boolean salir=false;
        String opcion = "";
        
        do{
            System.out.println("Elige operacion");
            System.out.println("1 - Suma\n" +
                                "2 - Resta \n" + //
                                "3 - Multiplicacion\n" + //
                                "4 - Division\n" + //
                                "5 - Salir\n");
            opcion = scanner.nextLine();
            opcion = opcion.toLowerCase();

            switch(opcion){
                case "suma":
                    System.out.println("Introduce numero 1");
                    n1 = scanner.nextInt();
                    System.out.println("Introduce numero 2");
                    n2 = scanner.nextInt();
                    System.out.println("El resultado de la suma es: " + (n1+n2));
                    System.out.println();
                    scanner.nextLine();
                    break;
                case "resta":
                    System.out.println("Introduce numero 1");
                    n1 = scanner.nextInt();
                    System.out.println("Introduce numero 2");
                    n2 = scanner.nextInt();
                    System.out.println("El resultado de la resta es: " + (n1-n2));
                    System.out.println();
                    scanner.nextLine();
                    break;
                case "multiplicacion":
                    System.out.println("Introduce numero 1");
                    n1 = scanner.nextInt();
                    System.out.println("Introduce numero 2");
                    n2 = scanner.nextInt();
                    System.out.println("El resultado de la multiplicacion es: " + (n1*n2));
                    System.out.println();
                    scanner.nextLine();
                    break;
                case "division":
                    System.out.println("Introduce numero 1");
                    n1 = scanner.nextInt();
                    System.out.println("Introduce numero 2");
                    n2 = scanner.nextInt();
                    System.out.println("El resultado de la division es: " + (n1/n2));
                    System.out.println();
                    scanner.nextLine();
                    break;
                case "salir":
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
