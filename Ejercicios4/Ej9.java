package Ejercicios4;

import java.util.Scanner;

public class Ej9 {
    //Escribe un programa que calcule el costo de envío basado en la distancia y el peso del paquete.
    static float calcularCosto(float distancia, float peso){
        float costo;

        costo = distancia*peso;

        return costo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float distancia, peso;

        System.out.println("introduce distancia");
        distancia = scanner.nextFloat();
        System.out.println("Introduce peso del paquete");
        peso = scanner.nextFloat();

        System.out.println("El coste del envio será de " + calcularCosto(distancia,peso));

    }

}
