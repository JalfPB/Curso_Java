package Datos_Colecciones.Ejercicios2.Ej12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
     * Crea un programa que tome una lista de palabras y las agrupe en una tabla
     * hash, donde la clave es la longitud de la palabra y el valor es una lista de
     * palabras de esa longitud.
     */

    public static Map<Integer, List<String>> agruparPorLongitud(List<String> palabras) {
        Map<Integer, List<String>> tablaHash = new HashMap<>();

        for (String palabra : palabras) {
            int longitud = palabra.length();

            tablaHash.putIfAbsent(longitud, new ArrayList<>());

            tablaHash.get(longitud).add(palabra);
        }

        return tablaHash;
    }

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Alfonso", "Alejandro", "Pedro", "Ana", "Javier");

        Map<Integer, List<String>> resultado = agruparPorLongitud(palabras);

        for (Map.Entry<Integer, List<String>> entrada : resultado.entrySet()) {
            System.out.println("Longitud " + entrada.getKey() + ": " + entrada.getValue());
        }
    }

}
