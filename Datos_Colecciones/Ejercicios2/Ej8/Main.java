package Datos_Colecciones.Ejercicios2.Ej8;

public class Main {
    /*
     * Simula las funcionalidades de “deshacer” y “rehacer” en un editor de texto
     * utilizando dos pilas, una para almacenar los cambios y otra para los cambios
     * deshechos.
     */
    public static void main(String[] args) {

        Editor editor = new Editor();

        editor.escribir("Hola");
        editor.mostrarTexto();

        editor.escribir(" Mundo");
        editor.mostrarTexto();

        editor.deshacer();
        editor.mostrarTexto();

        editor.rehacer();
        editor.mostrarTexto();

        editor.escribir("!");
        editor.mostrarTexto();

        editor.rehacer();

    }

}
