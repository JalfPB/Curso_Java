package Datos_Colecciones.Ejercicios2.Ej8;

import java.util.Stack;

public class Editor {
    private Stack<String> pilaCambios;
    private Stack<String> pilaDeshacer;
    private String textoActual;

    public Editor() {
        pilaCambios = new Stack<>();
        pilaDeshacer = new Stack<>();
        textoActual = "";
    }

    public void escribir(String nuevoTexto) {
        pilaCambios.push(textoActual);
        textoActual += nuevoTexto;
        pilaDeshacer.clear();
        System.out.println("Escrito: " + nuevoTexto);
    }


    public void deshacer() {
        if (!pilaCambios.isEmpty()) {
            pilaDeshacer.push(textoActual);
            textoActual = pilaCambios.pop();
            System.out.println("Deshacer realizado. Texto actual: " + textoActual);
        } else {
            System.out.println("No hay cambios para deshacer.");
        }
    }

    public void rehacer() {
        if (!pilaDeshacer.isEmpty()) {
            pilaCambios.push(textoActual);
            textoActual = pilaDeshacer.pop();
            System.out.println("Rehacer realizado. Texto actual: " + textoActual);
        } else {
            System.out.println("No hay cambios para rehacer.");
        }
    }

    public void mostrarTexto() {
        System.out.println("Texto actual: " + textoActual);
    }
}

