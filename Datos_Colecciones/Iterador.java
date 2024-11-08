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

        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Pepe García");
        clientes.add("Toni Pérez");
        clientes.add("Marta Gomez");
        clientes.add("Sara Martinez");

        Iterator<String> clienteIterator = clientes.iterator();

        /*for(String c : clientes) {
            if(c.equals("Pepe García")){
                clientes.remove(c);
            }
            System.out.println(c);
        }// ConcurrentModificationException*/

        while(clienteIterator.hasNext()){
            String cliente = clienteIterator.next();
            if(cliente.equals("Toni Pérez")){
                clienteIterator.remove();
            }
            System.out.println(cliente);
        }
    }

}
