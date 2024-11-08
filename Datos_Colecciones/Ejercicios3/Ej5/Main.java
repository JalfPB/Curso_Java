package Datos_Colecciones.Ejercicios3.Ej5;

public class Main {
    /*
     * Crear una clase MatrixIterator que permita iterar sobre los elementos de un
     * array bidimensional como si fuera una lista unidimensional.
     */
    public static void main(String[] args) {

        Integer[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        MatrixIterator<Integer> iterator = new MatrixIterator<>(matrix);

        System.out.println("Elementos de la matriz:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }

}
