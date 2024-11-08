package Datos_Colecciones.Ejercicios3.Ej4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    /*
     * Dada una lista de números enteros, crear una función que devuelva solo los
     * números pares usando un Iterator.
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);

        Iterator it = lista.iterator();
        while (it.hasNext()) {
            int n = (int)it.next();
            if(n % 2 == 0) System.out.println(n);
        }
    }

}
