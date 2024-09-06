package Ejercicios4;

public class Ej45 {
    private int[] cola;
    private int frente;
    private int finalCola;
    private int tamaño;

    // Agregar un elemento al final de la cola
    public void encolar(int elemento) {
        if (tamaño == cola.length) {
            System.out.println("La cola está llena");
            return;
        }
        finalCola = (finalCola + 1) % cola.length;
        cola[finalCola] = elemento;
        tamaño++;
    }

    // Eliminar un elemento desde el frente de la cola
    public int desencolar() {
        if (tamaño == 0) {
            System.out.println("La cola está vacía");
            return -1; // Indicar que la cola está vacía
        }
        int elemento = cola[frente];
        frente = (frente + 1) % cola.length;
        tamaño--;
        return elemento;
    }

    // Imprimir los elementos de la cola
    public void imprimirCola() {
        System.out.print("[");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[(frente + i) % cola.length]);
            if (i < tamaño - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int capacidad = 5;
        int[] cola = new int[capacidad];
        int frente = 0;
        int finalCola = -1;
        int tamaño = 0;

        // Función para encolar un elemento
        encolar(cola, 3, capacidad, frente, finalCola, tamaño);
        tamaño++;
        finalCola = (finalCola + 1) % capacidad;

        encolar(cola, 5, capacidad, frente, finalCola, tamaño);
        tamaño++;
        finalCola = (finalCola + 1) % capacidad;

        encolar(cola, 7, capacidad, frente, finalCola, tamaño);
        tamaño++;
        finalCola = (finalCola + 1) % capacidad;

        imprimirCola(cola, frente, tamaño, capacidad);

        // Desencolar dos elementos
        frente = desencolar(frente, tamaño);
        tamaño--;

        frente = desencolar(frente, tamaño);
        tamaño--;

        imprimirCola(cola, frente, tamaño, capacidad);

        // Encolar más elementos
        encolar(cola, 9, capacidad, frente, finalCola, tamaño);
        tamaño++;
        finalCola = (finalCola + 1) % capacidad;

        encolar(cola, 11, capacidad, frente, finalCola, tamaño);
        tamaño++;
        finalCola = (finalCola + 1) % capacidad;

        imprimirCola(cola, frente, tamaño, capacidad);
    }

    // Función para encolar un elemento
    public static void encolar(int[] cola, int elemento, int capacidad, int frente, int finalCola, int tamaño) {
        if (tamaño == capacidad) {
            System.out.println("La cola está llena. No se puede encolar el elemento " + elemento);
            return;
        }
        finalCola = (finalCola + 1) % capacidad;
        cola[finalCola] = elemento;
    }

    // Función para desencolar un elemento
    public static int desencolar(int frente, int tamaño) {
        if (tamaño == 0) {
            System.out.println("La cola está vacía. No se puede desencolar.");
            return frente;
        }
        System.out.println("Elemento desencolado: " + frente);
        frente = (frente + 1) % tamaño;
        return frente;
    }

    // Función para imprimir la cola
    public static void imprimirCola(int[] cola, int frente, int tamaño, int capacidad) {
        System.out.print("Cola: [");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[(frente + i) % capacidad]);
            if (i < tamaño - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
