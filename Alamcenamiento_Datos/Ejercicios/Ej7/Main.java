package Alamcenamiento_Datos.Ejercicios.Ej7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
     * Crea un método que reciba 2 archivos de texto y combine el contenido de los 2
     * archivos. Para ello, se creará un nuevo archivo donde se debe añadir una
     * palabra de cada archivo de forma consecutiva mientras queden palabras en cada
     * uno de los archivos, si algún archivo se queda sin palabras se deben añadir
     * las todas las palabras del otro archivo.
     */

     /*
     * Crear una sobrecarga del método anterior para que reciba una Lista de
     * archivos a combinar. El archivo resultante deberá contener todas las palabras
     * de todos los archivos de la lista.
     */

     public static void combinarArchivos(String rutaArchivo1, String rutaArchivo2, String rutaArchivoDestino) {
        try (
            BufferedReader lector1 = new BufferedReader(new FileReader(rutaArchivo1));
            BufferedReader lector2 = new BufferedReader(new FileReader(rutaArchivo2));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivoDestino))
        ) {
            // Crear listas de palabras para ambos archivos
            List<String> palabras1 = obtenerPalabras(lector1);
            List<String> palabras2 = obtenerPalabras(lector2);

            // Usar un StringBuilder para armar el contenido combinado
            StringBuilder contenidoCombinado = new StringBuilder();

            // Combinar palabras de forma alternada
            int i = 0;
            while (i < palabras1.size() || i < palabras2.size()) {
                if (i < palabras1.size()) {
                    contenidoCombinado.append(palabras1.get(i)).append(" ");
                }
                if (i < palabras2.size()) {
                    contenidoCombinado.append(palabras2.get(i)).append(" ");
                }
                i++;
            }

            // Escribir el contenido combinado en el archivo de destino
            escritor.write(contenidoCombinado.toString().trim());
            System.out.println("El archivo ha sido combinado exitosamente en: " + rutaArchivoDestino);

        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }
    }

    // Método auxiliar para obtener palabras de un archivo de texto
    private static List<String> obtenerPalabras(BufferedReader lector) throws IOException {
        List<String> palabras = new ArrayList<>();
        String linea;
        while ((linea = lector.readLine()) != null) {
            String[] palabrasLinea = linea.split("\\s+"); // Divide por espacios o saltos de línea
            Collections.addAll(palabras, palabrasLinea);  // Agrega todas las palabras a la lista
        }
        return palabras;
    }

    // Sobrecarga del método para combinar una lista de archivos
    public static void combinarArchivos(List<String> rutasArchivos, String rutaArchivoDestino) {
        try (
            BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivoDestino))
        ) {
            // Crear una lista de listas de palabras, una por cada archivo
            List<List<String>> listasDePalabras = new ArrayList<>();

            // Leer y almacenar palabras de cada archivo en la lista de listas
            for (String rutaArchivo : rutasArchivos) {
                try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
                    listasDePalabras.add(obtenerPalabras(lector));
                }
            }

            // Construir el contenido combinado alternando palabras de cada lista
            StringBuilder contenidoCombinado = new StringBuilder();
            boolean hayPalabras = true;
            int i = 0;

            // Alternar palabras de cada lista mientras haya palabras restantes
            while (hayPalabras) {
                hayPalabras = false;
                for (List<String> palabras : listasDePalabras) {
                    if (i < palabras.size()) {
                        contenidoCombinado.append(palabras.get(i)).append(" ");
                        hayPalabras = true; // Indica que aún hay palabras en alguna lista
                    }
                }
                i++;
            }

            // Escribir el contenido combinado en el archivo de destino
            escritor.write(contenidoCombinado.toString().trim());
            System.out.println("Los archivos han sido combinados exitosamente en: " + rutaArchivoDestino);

        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        String rutaArchivo1 = "Alamcenamiento_Datos\\Ejercicios\\Ej7\\archivo1.txt";
        String rutaArchivo2 = "Alamcenamiento_Datos\\Ejercicios\\Ej7\\fichero.txt";
        String rutaArchivoDestino = "Alamcenamiento_Datos\\Ejercicios\\Ej7\\destino.txt";
        
        combinarArchivos(rutaArchivo1, rutaArchivo2, rutaArchivoDestino);

    }

}
