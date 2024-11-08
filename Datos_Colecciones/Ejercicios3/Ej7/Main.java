package Datos_Colecciones.Ejercicios3.Ej7;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    /*
     * Crear una clase SkippingIterator que envuelva otro iterador pero solo
     * devuelva cada n-ésimo elemento. Por ejemplo, si n = 2, el iterador devolverá
     * cada segundo elemento.
     */

     public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        Iterator<Integer> originalIterator = lista.iterator();

        SkippingIterator<Integer> skippingIterator = new SkippingIterator<>(originalIterator, 2);

        System.out.println("Elementos de la lista cada 2:");
        while (skippingIterator.hasNext()) {
            System.out.print(skippingIterator.next() + " ");
        }
     }

}
