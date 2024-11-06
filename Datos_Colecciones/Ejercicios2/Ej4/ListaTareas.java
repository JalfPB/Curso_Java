package Datos_Colecciones.Ejercicios2.Ej4;

import java.util.HashMap;

public class ListaTareas {

    static HashMap<String, Tarea> lista = new HashMap<>();

    public static void anadirTarea(Tarea tarea){
        lista.put(tarea.getNombre(), tarea);
    }

    public static void eliminarTarea(Tarea tarea){
        lista.remove(tarea.getNombre());
    }

    public static void completarTarea(String nombre){
        Tarea  tareaAux = lista.get(nombre);
        tareaAux.setCompletada(true);
        lista.remove(nombre);
        lista.put(tareaAux.getNombre(), tareaAux);
    }

    public static void mostrarLista(){
        for(String clave : lista.keySet()) {
            System.out.println("Nombre: " + clave + ", Completada: " +
                                                    lista.get(clave).isCompletada());
        }
    }

    

}
