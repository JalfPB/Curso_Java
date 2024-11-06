package Datos_Colecciones.Ejercicios2.Ej10;

import java.util.LinkedList;

public class Main {
    /*
     * Escribe un método que reciba una lista de números enteros y filtre aquellos
     * que sean pares. Devuelve la lista filtrada.
     */

     static LinkedList pares(LinkedList<Integer> lista){
        LinkedList<Integer> listaNueva = new LinkedList<>();
        for (int i = 0; i < lista.size(); i++) { 
            if(lista.get(i) % 2 == 0) listaNueva.add(lista.get(i));
        } 

        return listaNueva;
     }
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);

        LinkedList<Integer> listaNueva = pares(lista);

        for (int i = 0; i < listaNueva.size(); i++) { 
            System.out.println(listaNueva.get(i));
        } 
        
    }
}
