package Ejercicios2;

import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {
        // Escribe un algoritmo que calcule el salario semanal de un trabajador. Si
        // trabaja más de 40 horas, las horas adicionales se pagan al doble.

        float salario, sueldo;
        int horas, horasExtra = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce sueldo por hora");
        sueldo = scanner.nextFloat();

        System.out.println("Introduce horas trabajadas");
        horas = scanner.nextInt();

        if (horas > 40) {
            horasExtra = horas - 40;
            horas = 40;
        }

        salario = (horas * sueldo) + (horasExtra * (sueldo * 2));
        System.out.println("Tu salario es de: " + salario);
    }

}
