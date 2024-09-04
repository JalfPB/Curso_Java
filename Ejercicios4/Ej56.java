package Ejercicios4;
import java.util.Scanner;

public class Ej56 {
    // Escribe un programa que pida al usuario ingresar números positivos. El
    // programa debe sumar todos los números ingresados y mostrar el resultado al
    // finalizar. El programa debe terminar cuando el usuario ingrese un número
    // negativo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0,suma = 0;

        do{
            System.out.println("Introduce numero");
            numero = scanner.nextInt();
            if(numero>=0)
                suma += numero;
        }while (numero>=0);

        System.out.println("La suma es de " + suma);

    }

}
