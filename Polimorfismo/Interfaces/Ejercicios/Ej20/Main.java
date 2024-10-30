package Polimorfismo.Interfaces.Ejercicios.Ej20;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Empleado> lista = new ArrayList<Empleado>();

        lista.add(new Empleado(123));
        lista.add(new Empleado(12));
        lista.add(new Empleado(145));

        Collections.sort(lista);

        for (Empleado p : lista){
            System.out.println(p.toString());
        }

    }

}
