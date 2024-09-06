package Ejercicios4;
import java.util.Scanner;

public class Ej21For {

    public static int calcularMCD(int a, int b) {
        // Usamos un bucle for en lugar de while
        for (; b != 0; ) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int mcd = calcularMCD(numero1, numero2);

        System.out.println("El Máximo Común Divisor de " + numero1 + " y " + numero2 + " es: " + mcd);
    }

}
