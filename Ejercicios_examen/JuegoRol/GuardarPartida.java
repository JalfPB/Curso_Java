package JuegoRol;

import java.io.*;
import java.util.ArrayList;

class GuardarPartida {
    public static void guardarEstado(ArrayList<Personaje> personajes, Mapa mapa) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("partidaGuardada.bin"))) {
            oos.writeObject(personajes);
            oos.writeObject(mapa);
        }
    }

    public static void cargarEstado() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("partidaGuardada.bin"))) {
            ArrayList<Personaje> personajes = (ArrayList<Personaje>) ois.readObject();
            Mapa mapa = (Mapa) ois.readObject();
            System.out.println("Partida cargada correctamente.");
        }
    }
}