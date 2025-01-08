package SupuestoPractico.Ej6;

import java.io.*;

public class Serializacion {
    public static void guardarEstado(Object objeto, String archivo) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(objeto);
        }
    }

    public static Object cargarEstado(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return in.readObject();
        }
    }
}

