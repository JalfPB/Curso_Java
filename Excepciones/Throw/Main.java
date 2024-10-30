package Excepciones.Throw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void dividir (int n, int m) throws ArithmeticException {
        
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int minutos;
        System.out.println("Indica los minutos");
        minutos = entrada.nextInt();
        if(minutos < 0 || minutos >= 60) {
            throw new InputMismatchException("Valor fuera de rango, de 0 a 60");
        }
        System.out.println("Los minutos introducidos son validos.");
    }

}
