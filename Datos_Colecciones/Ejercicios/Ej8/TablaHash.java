package Datos_Colecciones.Ejercicios.Ej8;

import java.util.HashMap;

public class TablaHash {

    HashMap<String, Integer> tabla = new HashMap<>();

    public void insertar(String nombre, int edad){
        tabla.put(nombre, edad);
    }

    public void eliminar(String nombre){
        tabla.remove(nombre);
    }

    public void mostrar(){
        for(String clave : tabla.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " +
                                                    tabla.get(clave));
        }
    }

}
