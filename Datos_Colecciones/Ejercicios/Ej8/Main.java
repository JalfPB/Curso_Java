package Datos_Colecciones.Ejercicios.Ej8;

public class Main {

    public static void main(String[] args) {
        TablaHash tabla = new TablaHash();

        tabla.insertar("Alfonso", 23);
        tabla.insertar("Andrea", 21);
        tabla.insertar("Pedro", 40);

        tabla.mostrar();
        tabla.eliminar("Alfonso");
        System.out.println();

        tabla.mostrar();
    }

}
