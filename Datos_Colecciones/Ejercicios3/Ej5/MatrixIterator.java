package Datos_Colecciones.Ejercicios3.Ej5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIterator<T> implements Iterator<T> {
    private final T[][] matrix;
    private int fila = 0;
    private int columna = 0;

    public MatrixIterator(T[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        // Si ha llegado al final de la fila actual y hay mas filas, avanza a la siguiente fila no vacia
        while (fila < matrix.length && columna >= matrix[fila].length) {
            fila++;
            columna = 0; // Reseteamos la columna al inicio
        }
        return fila < matrix.length;
    }

    // Método que retorna el siguiente elemento en la iteración
    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más elementos en la matriz.");
        }
        T value = matrix[fila][columna];
        columna++;
        return value;
    }

}

