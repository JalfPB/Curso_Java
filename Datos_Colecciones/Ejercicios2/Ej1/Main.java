package Datos_Colecciones.Ejercicios2.Ej1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
/*
 * Escribe un método que tome una cadena como entrada y use una pila para invertirla.
 */
    public static void main(String[] args) {
        Stack<Character> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce cadena");
        String cad = scanner.nextLine();

        for (int i = 0; i < cad.length(); i++) { 
            pila.push(cad.charAt(i)); 
        } 

        while (!pila.isEmpty()) {
        System.out.print(pila.pop());
} 
    }

}
