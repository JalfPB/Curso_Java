package Datos_Colecciones.Ejercicios3.Ej7;

import java.util.Iterator;

import java.util.NoSuchElementException;

public class SkippingIterator<T> implements Iterator<T> {
    private final Iterator<T> iterator;
    private final int n; 
    private int cont = 0; // Contador para llevar el numero de saltos

    public SkippingIterator(Iterator<T> iterator, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El valor de n debe ser mayor que 0.");
        }
        this.iterator = iterator;
        this.n = n;
    }

    @Override
    public boolean hasNext() {
        while (iterator.hasNext() && cont < n - 1) {
            iterator.next();
            cont++;
        }
        return iterator.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más elementos en la iteración.");
        }
        T value = iterator.next();
        cont = 0;
        return value;
    }
}

