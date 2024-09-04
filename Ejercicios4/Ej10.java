package Ejercicios4;

import java.util.Scanner;

public class Ej10 {
    // Escribe un programa que simule un cajero automático que dispense en la
    // cantidad mínima de billetes necesaria de 50, 20 y 10 para un monto específico
    // que quiera sacar el usuario.

    static void sacarDinero(int cantidad){
        int b50=0,b20=0,b10=0;
        if(cantidad%10!=0){
            System.out.println("La cantidad a sacar debe ser multiplo de 10");
        }else{
            if(cantidad>=50){
                b50 = cantidad/50;
                cantidad=cantidad - (50 * b50);
            }

            if(cantidad>=20){
                b20 = cantidad/20;
                cantidad=cantidad - (20 * b20);
            }

            if(cantidad>=10){
                b10 = cantidad/10;
                cantidad=cantidad - (10 * b10);
            }
            System.out.println("El cajero devolvera " + b50 + " billetes de 50, " + b20 + " billetes de 20, " + b10 + " billetes de 10");
        }

    }

    public static void main(String[] args) {
        int cantidad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce cantidad a sacar");
        cantidad = scanner.nextInt();

        sacarDinero(cantidad);
    }

}
