package Datos_Colecciones.Ejercicios3.Ej8;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    /*
     * Dada una lista de objetos de tipo Producto (con atributos como precio),
     * utilizar un Iterator para reducir un porcentaje en el precio de los productos
     * que superen un valor determinado.
     */
    public static void main(String[] args) {
        ArrayList<Producto>lista = new ArrayList<>();

        lista.add(new Producto("Producto1", 10.0));
        lista.add(new Producto("Producto2", 15.0));
        lista.add(new Producto("Producto3", 30.0));

        System.out.println(lista);

        System.out.println("S le producto vale mas de 12 se le aplica un descuento del 50%");

        Iterator it = lista.iterator();

        while( it.hasNext() ){
            Producto prod = (Producto)it.next();
            if(prod.getPrecio() > 12) prod.setPrecio(prod.getPrecio()*0.50);
            System.out.println("Precio del producto " + prod.getNombre() + " es " + prod.getPrecio());
        }
    }

}
