package Datos_Colecciones.Ejercicios3.Ej3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleStack<T> implements Iterable<T> {

    // Nodo interno que representa cada elemento de la pila
    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<T> top;  // Puntero al nodo superior de la pila
    private int tamanio;

    public SimpleStack() {
        top = null;
        tamanio = 0;
    }

    // Metodo para agregar un elemento a la pila
    public void push(T value) {
        top = new Node<>(value, top);
        tamanio++;
    }

    // Metodo para eliminar el elemento superior de la pila
    public T pop() {
        if (estaVacio()) {
            throw new NoSuchElementException("No hay elementos en la pila");
        }
        T value = top.value;
        top = top.next;
        tamanio--;
        return value;
    }

    public T peek() {
        if (estaVacio()) {
            throw new NoSuchElementException("No hay elementos en la pila");
        }
        return top.value;
    }

    public boolean estaVacio() {
        return top == null;
    }

    public int tamanio() {
        return tamanio;
    }

    // Implementación del metodo iterator() de la interfaz Iterable
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }

}

