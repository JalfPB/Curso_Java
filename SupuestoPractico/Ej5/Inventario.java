package SupuestoPractico.Ej5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Inventario {

    ArrayList<String> objetos = new ArrayList<>();
    Stack<String> pociones = new Stack<>();
    Queue<String> habilidades = new LinkedList<>();

    // Añadir un objeto al inventario
    public void agregarObjeto(String objeto) {
        objetos.add(objeto);
        System.out.println("Objeto añadido: " + objeto);
    }

    // Remover un objeto del inventario
    public boolean removerObjeto(String objeto) {
        if (objetos.remove(objeto)) {
            System.out.println("Objeto removido: " + objeto);
            return true;
        } else {
            System.out.println("Objeto no encontrado: " + objeto);
            return false;
        }
    }

    public void mostrarInventario(){
        for(String o : objetos){
            System.out.println(o);
        }
    }

    // Listar todos los objetos en el inventario
    public void listarObjetos() {
        System.out.println("Objetos en el inventario: " + objetos);
    }

    // Métodos para gestionar las pociones

    // Añadir una poción al inventario (LIFO)
    public void agregarPocion(String pocion) {
        pociones.push(pocion);
        System.out.println("Poción añadida: " + pocion);
    }

    // Usar la última poción añadida (remueve de la pila)
    public String usarPocion() {
        if (!pociones.isEmpty()) {
            String pocion = pociones.pop();
            System.out.println("Poción usada: " + pocion);
            return pocion;
        } else {
            System.out.println("No hay pociones disponibles.");
            return null;
        }
    }

    // Ver la próxima poción sin usarla
    public String verProximaPocion() {
        if (!pociones.isEmpty()) {
            return pociones.peek();
        } else {
            System.out.println("No hay pociones disponibles.");
            return null;
        }
    }

    // Métodos para gestionar habilidades

    // Añadir una habilidad al inventario (FIFO)
    public void agregarHabilidad(String habilidad) {
        habilidades.offer(habilidad);
        System.out.println("Habilidad añadida: " + habilidad);
    }

    // Usar la primera habilidad en la cola
    public String usarHabilidad() {
        if (!habilidades.isEmpty()) {
            String habilidad = habilidades.poll();
            System.out.println("Habilidad usada: " + habilidad);
            return habilidad;
        } else {
            System.out.println("No hay habilidades disponibles.");
            return null;
        }
    }

    // Ver la siguiente habilidad sin usarla
    public String verProximaHabilidad() {
        if (!habilidades.isEmpty()) {
            return habilidades.peek();
        } else {
            System.out.println("No hay habilidades disponibles.");
            return null;
        }
    }

    // Métodos de consulta

    // Verificar si un objeto específico está en el inventario
    public boolean tieneObjeto(String objeto) {
        return objetos.contains(objeto);
    }

    // Obtener el número de objetos en el inventario
    public int contarObjetos() {
        return objetos.size();
    }

    // Obtener el número de pociones en el inventario
    public int contarPociones() {
        return pociones.size();
    }

    // Obtener el número de habilidades en el inventario
    public int contarHabilidades() {
        return habilidades.size();
    }

}
