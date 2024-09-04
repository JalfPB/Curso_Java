package Ejercicios4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        //Escribe un programa que lea un número del 1 al 7 e imprima el día de la semana correspondiente.
        Scanner scanner = new Scanner(System.in);
        int dia;

        System.out.println("Introduce dia de la semana del 1 al 7");

        dia = scanner.nextInt();
        if(dia<1 || dia>7){
            System.out.println("No es un día valido");
        }else{
            switch(dia){
                case 1:
                    System.out.println("Es lunes");
                    break;
                case 2:
                    System.out.println("Es martes");
                    break;
                case 3:
                    System.out.println("Es Miercoles");
                    break;
                case 4:
                    System.out.println("Es jueves");
                    break;
                case 5:
                    System.out.println("Es viernes");
                    break;
                case 6:
                    System.out.println("Es Sabado");
                    break;
                case 7:
                    System.out.println("Es domingo");
                    break;
                default:
                    break;
            }
        }

    }

}
