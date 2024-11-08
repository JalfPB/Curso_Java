package Datos_Colecciones.Ejercicios3.Ej2;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    /*
     * Crear una lista de nombres y usar Iterator para eliminar aquellos que cumplan
     * una condición específica.
     */
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Alfonso");
        lista.add("Andrea");
        lista.add("Pedro");

        Iterator it = lista.iterator();

        System.out.println("Lista original");
        System.out.println(lista);

        while(it.hasNext()){
            if(it.next().equals("Andrea")){
                it.remove();
            }
        }
        
        System.out.println("Lista despues de la condicion");
        System.out.println(lista);
    }

}
