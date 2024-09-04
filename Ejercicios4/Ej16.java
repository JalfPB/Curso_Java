package Ejercicios4;

import java.util.Scanner;

public class Ej16 {
    // Calcula la propina a pagar según la calidad del servicio (excelente, bueno,
    // regular, malo).

    static float calcularPropina(String calidad, float coste){
        float total=0;
        calidad = calidad.toLowerCase();

        switch(calidad){
            case "excelente":
                total = coste + (coste * 0.21f);
                break;
            case "bueno":
                total = coste + (coste * 0.15f);
                break;
            case "regular":
                total = coste + (coste * 0.5f);
                break;
            case "malo":
                total = coste;
                break;
        }

        return total;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calidad;
        Float coste;

        System.out.println("Introduce coste del servicio");
        coste = scanner.nextFloat();
        System.out.println("Introduce calidad del servicio");
        System.out.println("-Excelente\n-Bueno\n-Regular\n-Malo");
        scanner.nextLine();
        calidad = scanner.nextLine();

        System.out.println("El total del servicio es de " + calcularPropina(calidad, coste));


    }

}
