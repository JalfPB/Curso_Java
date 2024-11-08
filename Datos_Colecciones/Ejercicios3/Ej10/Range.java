package Datos_Colecciones.Ejercicios3.Ej10;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {
    private final int inicio;
    private final int tope;

    public Range(int inicio, int tope) {
        this.inicio = inicio;
        this.tope = tope;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int actual = inicio; // Variable que mantiene el valor actual en la iteración

            @Override
            public boolean hasNext() {
                return actual <= tope; // Verifica si el valor actual esta dentro del rango
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No hay mas elementos en el rango.");
                }
                return actual++; // Devuelve el valor actual y lo incrementa
            }
        };
    }
}


