package Lavanderi2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivos {
    public static void leerClientes(String archivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Procesa la información del cliente
                System.out.println("Cliente: " + linea);
            }
        }
    }
    public static void escribirRuta(String ruta) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rutas.txt", true))) {
            writer.write(ruta);
            writer.newLine();
        }
    }
}