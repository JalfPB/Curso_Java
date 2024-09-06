package Ejercicios2;

import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        /*
         * En una tienda, si el cliente gasta más de $100 se le hace un descuento del
         * 10%. Escribe un algoritmo que pida al usuario el monto de su compra y calcule
         * el total con o sin descuento.
         */
        float total, totalDescuento, descuento = 0.10f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce monto de la compra");
        total = scanner.nextFloat();

        if (total > 100) {
            totalDescuento = total - (total * descuento);
        } else {
            totalDescuento = total;
        }

        System.out.println("El total con descuento es " + totalDescuento + "€ y sin descuento " + total + "€");

    }

}
