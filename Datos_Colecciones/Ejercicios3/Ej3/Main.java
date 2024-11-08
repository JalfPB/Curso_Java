package Datos_Colecciones.Ejercicios3.Ej3;

public class Main {
    /*
     * Crear una clase SimpleStack<T> que simule el comportamiento de una pila
     * (stack) con operaciones básicas (push, pop) e implemente Iterable para que
     * pueda recorrerse usando Iterator.
     */
    public static void main(String[] args) {
        SimpleStack<Integer> stack = new SimpleStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Elemento de arriba: " + stack.peek());

        System.out.println("Desapilando: " + stack.pop());
        System.out.println("Desapilando: " + stack.pop());
    }

}
