package Lavanderi;

import java.io.*;

public class Persistencia {
    public static void guardarEstado(Lavanderia lavanderia, String archivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lavanderia);
        }
    }

    public static Lavanderia cargarEstado(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Lavanderia) ois.readObject();
        }
    }
}