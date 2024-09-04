package Ejercicios4;

import java.util.Scanner;

public class Ej12 {
    //Calcula los impuestos a pagar si los ingresos son superiores a un cierto umbral.

    static void calcularImpuestos(float ingresos, float umbral, float impuesto){
        float totalAPagar = 0;
        if(ingresos>umbral){
            totalAPagar=ingresos*impuesto;
        }

        System.out.println("El total de impuestos a pagar es de " + totalAPagar);
    }

    public static void main(String[] args) {
        float ingresos=0, umbral = 0, impuesto = 0.21f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tus ingresos");
        ingresos = scanner.nextFloat();

        System.out.println("Introduce el umbral desde el cual empiezas a pagar impuestos");
        umbral = scanner.nextFloat();

        calcularImpuestos(ingresos, umbral, impuesto);
    }

}
