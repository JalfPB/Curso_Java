package SupuestoPractico.Ej5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorMisiones {

    public static List<Mision> cargarMisionesDesdeArchivo(String archivo) {
        List<Mision> misiones = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(","); // Divide cada línea por comas
                if (partes.length == 4) { // Asegura que haya 4 elementos
                    try {
                        int nivelDificultad = Integer.parseInt(partes[0].trim());
                        int recompensa = Integer.parseInt(partes[1].trim());
                        String descripcion = partes[2].trim();
                        Estado estado = Estado.valueOf(partes[3].trim().toUpperCase());

                        // Crear una nueva misión y añadirla a la lista
                        Mision mision = new Mision(nivelDificultad, recompensa, descripcion, estado);
                        misiones.add(mision);

                    } catch (IllegalArgumentException e) {
                        System.err.println("Error al parsear la línea: " + linea);
                        e.printStackTrace();
                    }
                } else {
                    System.err.println("Línea inválida: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + archivo);
            e.printStackTrace();
        }

        return misiones;
    }

}
