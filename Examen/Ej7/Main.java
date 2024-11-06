package Examen.Ej7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Main {
    /*
     * Problema: Crea una clase Producto que contenga los atributos nombre (String) y precio (double).
     *       • Implementa la interfaz Comparable<Producto> para ordenar productos por precio.
     *       • Crea una lista de productos (ArrayList) y llena la lista con al menos cinco productos.
     *       • Ordena la lista y utiliza un bucle para mostrar los productos ordenados.
     *       • Implementa un método buscarProducto(ArrayList<Producto> productos, String nombre) que busque un producto por nombre en la lista. Si el producto no existe, lanza una excepción NoSuchElementException con el mensaje "Producto no encontrado".
     */

    // Metodo para mostrar los productos
    static void mostrarProductos(ArrayList<Producto> lista) {
        for (Producto producto : lista) {
            System.out.println(producto.toString());
        }
    }

    // Metodo para buscar un producto en la lista, si no existe devuelve una excepcion
    static boolean buscarProducto(ArrayList<Producto> lista, String nombre){

        for (Producto producto : lista) {
            if(producto.getNombre().compareToIgnoreCase(nombre) == 0) return true;
        }

        throw new NoSuchElementException("Producto no encontrado");

    }

    public static void main(String[] args) {
        ArrayList<Producto> lista = new ArrayList<>();

        lista.add(new Producto("Portatil", 600.0));
        lista.add(new Producto("Sobremesa", 1000.0));
        lista.add(new Producto("Smartphone", 450.0));
        lista.add(new Producto("Consola", 800.0));
        lista.add(new Producto("Monitor", 350.0));

        System.out.println("Lista sin ordenar");
        mostrarProductos(lista);

        System.out.println("\nLista ordenada");
        Collections.sort(lista);
        mostrarProductos(lista);

        System.out.println("Existe monitor en la lista?");
        System.out.println(buscarProducto(lista, "Monitor"));

        System.out.println("Existe teclado en la lista? ");
        System.out.println(buscarProducto(lista, "Teclado"));

    }

}
