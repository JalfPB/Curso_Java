package Datos_Colecciones.Ejercicios3.Ej1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    /*
     * Ejercicio 1: Iterar sobre una lista
     * Crear una lista de enteros y usar un Iterator para recorrerla y sumar sus
     * elementos.
     */
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        Iterator it = lista.iterator();

        int suma = 0;
        while (it.hasNext()) {
            suma += (int)it.next();
        }

        System.out.println("La suma de los numeros es: " + suma);
        

    }

}
