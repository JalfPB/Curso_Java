package Alamcenamiento_Datos.Ejercicios.Ej3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Hashtable;

public class Main {

    /*
     * Crea un método que permita buscar palabras en un fichero de texto. Se debe
     * mostrar el número de ocurrencias de dicha palabra. Utiliza un búfer para la
     * lectura.
     */

     public static int contarPalabraEnLinea(String linea, String palabra) {
        int contador = 0;
        String[] palabras = linea.split("\\s+");

        for (String palabraLinea : palabras) {
            if (palabraLinea.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }

    public static void buscarPalabraEnArchivo(String nombreArchivo, String palabra) {
        int totalOcurrencias = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                totalOcurrencias += contarPalabraEnLinea(linea, palabra);
            }
            System.out.println("La palabra '" + palabra + "' aparece " + totalOcurrencias + " veces en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String directorioDestino = Paths.get("Alamcenamiento_Datos", "Ejercicios", "Ej3")
                .toString();
        buscarPalabraEnArchivo(directorioDestino+"\\archivo1.txt", "perro");
        
    }

}
