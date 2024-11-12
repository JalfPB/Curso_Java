package Alamcenamiento_Datos.Ejercicios.Ej4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    /*
     * Crea un método que permita eliminar todas las ocurrencias de una palabra dada
     * en un fichero de texto. Este código producirá automáticamente un nuevo
     * fichero con la siguiente nomenclatura: Si el fichero de entrada se llama
     * fichero.txt, el fichero generado se llamará fichero_2.txt.
     */

    public static void main(String[] args) {

        borrarPalabra("fichero.txt", "gato");

    }

    public static void borrarPalabra(String nombreArchivo, String palabra) {
        String directorioDestino = Paths.get("Alamcenamiento_Datos", "Ejercicios", "Ej4")
                .toString();
        nombreArchivo = directorioDestino + "\\" + nombreArchivo;
        String nombreArchivoSinExtension = nombreArchivo.substring(0, nombreArchivo.lastIndexOf('.'));
        String extensionArchivo = nombreArchivo.substring(nombreArchivo.lastIndexOf('.'));

        String nuevoNombreArchivo = nombreArchivoSinExtension + "2" + extensionArchivo;

        try (
                BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
                BufferedWriter bw = new BufferedWriter(new FileWriter(nuevoNombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String lineaModificada = linea.replaceAll("\\b" + palabra + "\\b", "");
                bw.write(lineaModificada);
                bw.newLine();
            }

            System.out.println("El archivo se ha guardado como: " + nuevoNombreArchivo);

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

}
