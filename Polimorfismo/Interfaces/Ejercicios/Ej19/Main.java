package Polimorfismo.Interfaces.Ejercicios.Ej19;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Producto> lista = new ArrayList<Producto>();

        lista.add(new Producto(123));
        lista.add(new Producto(12));
        lista.add(new Producto(145));

        Collections.sort(lista);

        for (Producto p : lista){
            System.out.println(p.toString());
        }

    }

}
