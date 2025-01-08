package Lavanderi;

import java.io.*;
import java.util.HashMap;

public class ArchivoTexto {
    public static void guardarClientes(HashMap<String, Cliente> clientes, String archivo) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Cliente cliente : clientes.values()) {
                bw.write(cliente.toString());
                bw.newLine();
            }
        }
    }

    public static void cargarClientes(String archivo, HashMap<String, Cliente> clientes) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Lógica para parsear la línea y agregar clientes
            }
        }
    }
}