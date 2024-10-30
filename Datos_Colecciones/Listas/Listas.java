package Datos_Colecciones.Listas;
import java.util.List;
import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Añadimos elementos a la lista
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        // Mostramos la lista completa
        System.out.println("List: " + list);

        // Obtenemos un elemento por su indice
        String first = list.get(0);
        System.out.println("First element: first");

        // reemplazamos un elemento en un indice especifico
        list.set(1,"David");
        System.out.println("List after update: " + list);

        // Eliminamos un elemento por su indice
        list.remove(2);
        System.out.println("List after removal: " + list);

        // Tamaño de la lista
        System.out.println("List size: " + list.size());
    }

}
