package Datos_Colecciones.Ejercicios.Ej4;

public class Main {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar("Alfonso");
        lista.agregar("Alfredo");
        lista.agregar("Roberto");

        lista.mostrar();

        System.out.println("Existe la cadena Alfonso? " + lista.buscar("Alfonso"));

        lista.eliminar(0);
        lista.mostrar();
        System.out.println("Existe la cadena Alfonso? " + lista.buscar("Alfonso"));
    }

}
