package Polimorfismo.EjerciciosPolimorfismo.Ej6;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Libro1", "Autor1");
        Libro libro2 = new Libro("Libro1", "Autor1");
        Libro libro3 = new Libro("Libro2", "Autor2");

        HashSet<Libro> hashLibros = new HashSet<>();

        hashLibros.add(libro1);
        hashLibros.add(libro2);
        hashLibros.add(libro3);

        for (Libro libro : hashLibros) {
            System.out.println(libro);
        }

        Libro libroBuscar = new Libro("Libro1", "Autor1");
        System.out.println("Existe el libro? " + hashLibros.contains(libroBuscar));
    }

}
