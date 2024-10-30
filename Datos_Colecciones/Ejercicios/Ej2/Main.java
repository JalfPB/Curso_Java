package Datos_Colecciones.Ejercicios.Ej2;

public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.enqueue(0);
        System.out.println(cola.peek());
        cola.enqueue(1);
        System.out.println(cola.peek());

        System.out.println(cola.toString());

        System.out.println(cola.isEmpty());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.isEmpty());


    }

}
