package Ejercicios4;
import java.util.Scanner;

public class Ej55 {
    // Solicita al usuario que ingrese un número entero positivo. Utiliza un bucle
    // para validar que el número ingresado sea válido (es decir, que sea mayor que
    // 0).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.print("Introduce un numero entero positivo: ");
            // Verificamos si el valor ingresado es un entero
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero <= 0) {
                    System.out.println("El numero debe ser entero positivo.");
                }
            } else {
                System.out.println("Eso no es un numero entero. Intentalo de nuevo.");
                scanner.next();
            }
        }while (numero <= 0);

        System.out.println("Numero ingresado correctamente: " + numero);
        scanner.close();
    }

}
