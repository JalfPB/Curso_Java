package Datos_Colecciones.Pilas;

import java.util.Stack;

public class Pilas2 {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);

        // Mostrar el elemento encima de la pila
        System.out.println("Elemento encima de la pila: " + pila.peek());

        // Eliminar elementos de la pila
        System.out.println("Elemento eliminado: " + pila.pop());
        System.out.println("elemento en la cima de la pila despues de eliminar: " + pila.peek());
    }

}
