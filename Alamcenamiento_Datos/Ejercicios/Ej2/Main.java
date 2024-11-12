package Alamcenamiento_Datos.Ejercicios.Ej2;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class Main {
    /*
     * Crea un método que debe crear ‘n’ archivos, nombre(1).txt, nombre(2).txt,....
     * nombre(n).txt en la carpeta que se solicita al usuario. Dentro de cada
     * archivo deberá escribirse la frase “Este es el fichero nombre(n).txt”.
     */

    static void crear(int n) {
        String directorioDestino = Paths.get("Alamcenamiento_Datos", "Ejercicios", "Ej2")
                .toString();

        File directorio = new File(directorioDestino);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }

        for (int i = 0; i < n; i++) {
            try {
                String nombreArchivo = directorioDestino + "\\archivo" + i + ".txt";

                PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivo));

                escritor.println("Este es el fichero archivo" + i);
                escritor.close();

                System.out.println("Texto escrito en el archivo con éxito: " + nombreArchivo);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error al crear el archivo " + i);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        crear(3);

    }

}
