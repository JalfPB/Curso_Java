package Datos_Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador {

    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Madrid");
        ciudades.add("Caceres");
        ciudades.add("Badajoz");
        ciudades.add("Sevilla");

        Iterator<String> it = ciudades.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
