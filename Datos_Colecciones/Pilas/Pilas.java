package Datos_Colecciones.Pilas;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class Pilas {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        //Insertamos elementos
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Observamos el elemento en la cima sin eliminarlo
        System.out.println("Top element: " + stack.peek());

        // Eliminamos el elemento en la cima
        System.out.println("popped element: " + stack.peek());

        // Verificamos si la pila esta vacia
        System.out.println("Is stack empty? " + stack.isEmpty());

        Deque<String> stack2 = new ArrayDeque<>();

        //Insertamos elementos
        stack2.push("First");
        stack2.push("Second");
        stack2.push("Third");

        // Observamos el elemento en la cima sin eliminarlo
        System.out.println("Top element: " + stack2.peek());

        // Eliminamos el elemento en la cima
        System.out.println("popped element: " + stack2.peek());

        // Verificamos si la pila esta vacia
        System.out.println("Is stack empty? " + stack2.isEmpty());
    }

}
