package Datos_Colecciones.Ejercicios3.Ej9;

public class Main {
    /*
     * Crear una clase LinkedList<T> que implemente una lista enlazada simple y
     * proporcione un iterador que recorra sus elementos.
     */
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Elementos de la lista:");
        for (Integer item : list) {
            System.out.print(item + " ");
        }
    }

}
