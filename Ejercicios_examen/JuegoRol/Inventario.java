package JuegoRol;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Inventario {
    ArrayList<String> objetos;
    Stack<String> pociones;
    Queue<String> habilidades;

    public Inventario() {
        objetos = new ArrayList<>();
        pociones = new Stack<>();
        habilidades = new LinkedList<>();
    }

    public void agregarObjeto(String objeto) {
        objetos.add(objeto);
    }

    public void agregarPocion(String pocion) {
        pociones.push(pocion);
    }

    public void agregarHabilidad(String habilidad) {
        habilidades.add(habilidad);
    }
}