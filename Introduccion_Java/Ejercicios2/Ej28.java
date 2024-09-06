package Ejercicios2;

import java.util.Scanner;

public class Ej28 {

    public static void main(String[] args) {
        //Escribe un algoritmo que muestre un menú de opciones al usuario y continúe mostrando el menú hasta que el usuario elija la opción de salir.

        Scanner scanner = new Scanner(System.in);
        int n;
        boolean salir=false;

        while (!salir) {
            System.out.println("---------Menu---------");
            System.out.println("1: Opcion 1");
            System.out.println("2: Opcion 2");
            System.out.println("3: Opcion 3");
            System.out.println("4: Salir");

            n = scanner.nextInt();
            //if(n==4){
            //    salir=true;
            //    System.out.println("saliendo del menu");
            //}

            switch(n){
                case 1:
                System.out.println("Has elegido opcion 1");
                break;
                case 2:
                System.out.println("Has elegido opcion 2");
                break;
                case 3:
                System.out.println("Has elegido opcion 3");
                break;
                case 4:
                System.out.println("Has elegido salir");
                salir=true;
                break;
                default :
                System.out.println("Esa opcion no existe");
            }
        }
    }

}
