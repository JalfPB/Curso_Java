package Datos_Colecciones.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEjemplo {

    static void mostrar(ArrayList<Alumno> lista){
        for(Alumno a: lista){
            System.out.println(a.toString());
        }
    }

    public static void main(String[] args) {
        
        // COMPARABLE
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Pep","1111A",15));
        alumnos.add(new Alumno("Tom","2222A",17));
        alumnos.add(new Alumno("Jon","3333A",14));

        Collections.sort(alumnos);
        // Ordenamos en base al metodo compareTo de la clase Alumno
        mostrar(alumnos);
        // Los muestra ordenados por edad -> Jon, Pep, Tom

        alumnos.add(new Alumno("Ben", "4444A", 14));
        Collections.sort(alumnos);
        // Ordenamos en base al metodo compareTo de la clase Alumno
        mostrar(alumnos);
        // Los muestra ordenados por edad -> Ben, Jon, Pep, Tom

        // COMPARATOR
        Collections.sort(alumnos, new AlumnoPorEdadComparator());
        System.out.println("Alumnos ordenados por edad");
        mostrar(alumnos);

        Collections.sort(alumnos, new AlumnoPorNiaComparator());
        System.out.println("Alumnos ordenados por NIA");
        mostrar(alumnos);
    }

}
