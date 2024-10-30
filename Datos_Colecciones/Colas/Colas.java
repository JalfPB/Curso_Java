package Datos_Colecciones.Colas;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class Colas {

    public static void main(String[] args) {
        Queue<String> Marneus = new ArrayDeque<>();
        Queue<String> queue = new LinkedList<>();

        // Insertamos elementos en la cola
        Marneus.offer("First");
        Marneus.offer("Second");
        Marneus.offer("Third");

        // Observamos el elemento en frente de la cola sin eliminarlo
        System.out.println("Front element: " + Marneus.peek());
        
        // Eliminamos el primer elemento de la cola
        System.out.println("Removed element: " + Marneus.poll());

        // Verificamos el estado de la cola después de la eliminación
        System.out.println("queue after removal: " + Marneus);

        // Verificamos si la cola esta vacia
        System.out.println("Is empty? " + Marneus.isEmpty());


        // LinkedList

        // Insertamos elementos en la cola
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Observamos el elemento en frente de la cola sin eliminarlo
        System.out.println("Front element: " + queue.peek());
        
        // Eliminamos el primer elemento de la cola
        System.out.println("Removed element: " + queue.poll());

        // Verificamos el estado de la cola después de la eliminación
        System.out.println("queue after removal: " + queue);

        // Verificamos si la cola esta vacia
        System.out.println("Is empty? " + queue.isEmpty());

    }

}
