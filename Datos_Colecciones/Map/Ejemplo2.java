package Datos_Colecciones.Map;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo2 {

    public static void main(String[] args) {
        Map<String, Double> notasDeAlumnos = new HashMap<>();

        // Añadimos las notas de los alumnos
        notasDeAlumnos.put("Tim", 9.7);
        notasDeAlumnos.put("Bob", 8.5);
        notasDeAlumnos.put("Jon", 7.8);

        // Actualizamos la nota de Bob
        notasDeAlumnos.put("Bob", 8.8);
        notasDeAlumnos.put("Bob", notasDeAlumnos.getOrDefault("Bob", 8.0) + 1); // Bob -> 9.8

        // Añadimos nuevas notas para otros alumnos
        notasDeAlumnos.put("Jon", notasDeAlumnos.getOrDefault("Jon", 5.0) + 1); // Jon -> 8.8
        notasDeAlumnos.put("Kal", notasDeAlumnos.getOrDefault("Bob", 5.0));      // Kal -> 9.8
        notasDeAlumnos.put("Kal", notasDeAlumnos.getOrDefault("Kal", 0.0));      // Kal -> 9.8

        // Mostramos los datos con entrySet()
        System.out.println("Notas de alumnos:");
        for (Map.Entry<String, Double> pares : notasDeAlumnos.entrySet()) {
            System.out.println("La nota de " + pares.getKey() + " es " + pares.getValue());
        }

        // Mostramos nombres de los alumnos con keySet() y nota media
        System.out.println("Alumnos: " + notasDeAlumnos.keySet()); // Alumnos: [Bob, Kal, Jon, Tim]

        double sumaNotas = 0;
        for (Double nota : notasDeAlumnos.values()) {
            sumaNotas += nota;
        }

        System.out.println("Nota media: " + sumaNotas / notasDeAlumnos.size()); // Nota media
    }
}
