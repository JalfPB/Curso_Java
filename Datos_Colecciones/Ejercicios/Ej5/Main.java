package Datos_Colecciones.Ejercicios.Ej5;

public class Main {

    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        int[] valoresAInsertar = { 50, 30, 20, 40, 70, 60, 80 };
        for (int valor : valoresAInsertar) {
            arbol.insertar(valor);
        }

        int[] valoresABuscar = { 25, 40, 70, 90 };
        for (int valor : valoresABuscar) {
            boolean encontrado = arbol.buscar(valor);
            System.out.println("Valor " + valor + (encontrado ? " encontrado" : " no encontrado") + " en el arbol.");
        }

        System.out.print("Elementos del arbol en orden: ");
        arbol.recorrerEnOrden();

        System.out.println();
        System.out.println("Altura del arbol: " + arbol.calcularAltura());
    }

}
