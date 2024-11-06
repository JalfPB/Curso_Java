package Datos_Colecciones.Ejercicios2.Ej5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    /*
     * Escribe un método que elimine los elementos duplicados de una lista.
     *  Usa tanto una lista enlazada como un ArrayList.
     */

    public static <T> List<T> eliminarDuplicadosArrayList(List<T> lista) {
        Set<T> conjunto = new HashSet<>(lista);
        return new ArrayList<>(conjunto);       
    }

    public static <T> List<T> eliminarDuplicadosLinkedList(List<T> lista) {
        Set<T> conjunto = new HashSet<>(lista);
        return new LinkedList<>(conjunto);
    }

    public static void main(String[] args) {
        // Ejemplo con ArrayList
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        System.out.println("ArrayList original: " + arrayList);
        List<Integer> arrayListSinDuplicados = eliminarDuplicadosArrayList(arrayList);
        System.out.println("ArrayList sin duplicados: " + arrayListSinDuplicados);

        // Ejemplo con LinkedList
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        System.out.println("LinkedList original: " + linkedList);
        List<Integer> linkedListSinDuplicados = eliminarDuplicadosLinkedList(linkedList);
        System.out.println("LinkedList sin duplicados: " + linkedListSinDuplicados);
    
     }

}
