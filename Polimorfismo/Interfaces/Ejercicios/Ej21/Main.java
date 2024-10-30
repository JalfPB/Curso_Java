package Polimorfismo.Interfaces.Ejercicios.Ej21;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Ciudad> lista = new ArrayList<Ciudad>();

        lista.add(new Ciudad(123));
        lista.add(new Ciudad(12));
        lista.add(new Ciudad(145));

        Collections.sort(lista);

        for (Ciudad p : lista){
            System.out.println(p.toString());
        }

    }

}
