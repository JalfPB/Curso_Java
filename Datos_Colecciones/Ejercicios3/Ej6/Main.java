package Datos_Colecciones.Ejercicios3.Ej6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    /*
     * Dada una lista, crear un iterador que recorra la lista en orden inverso, es
     * decir, del último elemento al primero.
     */
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        ListIterator<Integer> itr = lista.listIterator(lista.size());

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }

}
