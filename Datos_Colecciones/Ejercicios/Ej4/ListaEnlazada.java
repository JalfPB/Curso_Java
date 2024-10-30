package Datos_Colecciones.Ejercicios.Ej4;

import java.util.ArrayList;
import java.util.List;

public class ListaEnlazada {

    List<String> lista = new ArrayList<>();

    public void agregar(String cadena) {
        lista.add(cadena);
    }

    public void eliminar(int n) {
        lista.remove(n);
    }

    public Boolean buscar(String cadena) {

        for (String s : lista) {

            if (s.equals(cadena))
                return true;

        }
        return false;
    }

    public void mostrar(){
        for (String s : lista) {
            System.out.println(s);
        }
    }

}
