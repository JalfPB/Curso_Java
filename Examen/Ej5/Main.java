package Examen.Ej5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /*
     * Problema: Crea una clase Persona con atributos nombre y edad. Implementa la
     * interfaz Comparable<Persona> para que las personas se ordenen por edad.
     * • En la clase principal, crea un ArrayList de personas y ordena la lista.
     * • Imprime la lista ordenada.
     */

    // Metodo para mostrar el contenido del ArrayList
    static void mostrarPersonas(ArrayList<Persona> lista) {
        for (Persona persona : lista) {
            System.out.println(persona.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Alfon", 23));
        lista.add(new Persona("Pedro", 40));
        lista.add(new Persona("Andrea", 10));

        System.out.println("Lista sin ordenar: ");
        mostrarPersonas(lista);

        System.out.println("\nLista ordenada: ");
        Collections.sort(lista);
        mostrarPersonas(lista);
    }

}
