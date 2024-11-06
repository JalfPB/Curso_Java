package Examen.Ej8;

public class Main {
    /*
     * Problema: Crea una clase Libro que contenga los atributos titulo, autor y numPaginas.
     *       • Crea un constructor que permita inicializar titulo y autor.
     *       • Sobrecarga el constructor para permitir inicializar todos los atributos (titulo, autor, numPaginas).
     *       • Implementa métodos imprimirDetalles() y imprimirDetalles(int limitePaginas), donde el segundo método solo imprima los detalles si el número de páginas es menor que el valor dado en limitePaginas.
     *   En la clase principal, crea instancias de Libro utilizando ambos constructores y llama a ambos métodos imprimirDetalles.
     */

    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Cervantes");
        Libro libro2 = new Libro("El camino de los reyes", "Brandon Sanderson", 1000);

        libro1.imprimirDetalles();
        libro1.imprimirDetalles(10);

        libro2.imprimirDetalles();
        libro2.imprimirDetalles(900);
    }

}
