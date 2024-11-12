import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /*
     * Crea un método que reciba un archivo de texto y modifique su contenido, de
     * modo que cada palabra del archivo deberá empezar en mayúscula.
     */

    public static void mayusculas(String ruta) {
        try {
            // Leer el contenido del archivo linea por linea
            Stream<String> lineas = Files.lines(Paths.get(ruta));
            // Modificar cada linea para que la primera letra de cada palabra empiece en
            // mayúscula
            String contenidoModificado = lineas
                    .map(Main::palabraMayuscula) // Modifica cada linea
                    .collect(Collectors.joining("\n")); // Une las lineas modificadas con saltos de linea
            lineas.close();

            // Escribir el contenido modificado de vuelta en el archivo
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
            writer.write(contenidoModificado);
            writer.close();

            System.out.println("El archivo ha sido modificado exitosamente.");

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    private static String palabraMayuscula(String linea) {
        String[] palabras = linea.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1).toLowerCase();
            }
        }
        // Unir las palabras nuevamente con espacios para formar la linea
        return String.join(" ", palabras);
    }

    public static void main(String[] args) {
        String ruta = "C:\\Users\\Usuario\\Desktop\\Curso_Java\\Alamcenamiento_Datos\\Ejercicios\\Ej6\\fichero.txt";
        mayusculas(ruta);
    }

}
