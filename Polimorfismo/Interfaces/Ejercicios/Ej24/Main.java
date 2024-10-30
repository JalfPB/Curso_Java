package Polimorfismo.Interfaces.Ejercicios.Ej24;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Libro> lista = new ArrayList<Libro>();

        lista.add(new Libro(123));
        lista.add(new Libro(12));
        lista.add(new Libro(145));

        Collections.sort(lista);

        for (Libro l : lista){
            System.out.println(l.toString());
        }

    }

}
