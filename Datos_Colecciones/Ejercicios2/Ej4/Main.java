package Datos_Colecciones.Ejercicios2.Ej4;

import java.util.HashMap;

public class Main {
    /*
     * Crea una aplicación simple para gestionar una lista de tareas.
     * Permite agregar, marcar como completadas y eliminar tareas.
     */

    public static void main(String[] args) {
        ListaTareas listaTareas = new ListaTareas();

        Tarea tarea1 = new Tarea("Sacar al perro", false);
        Tarea tarea2 = new Tarea("lavar los platos", true);

        listaTareas.anadirTarea(tarea1);
        listaTareas.anadirTarea(tarea2);

        listaTareas.mostrarLista();

        System.out.println("\n Se completa la tarea");
        listaTareas.completarTarea("Sacar al perro");

        listaTareas.mostrarLista();

        System.out.println("\n Se elimina la tarea 1");
        listaTareas.eliminarTarea(tarea1);
        listaTareas.mostrarLista();


        

    }
}
