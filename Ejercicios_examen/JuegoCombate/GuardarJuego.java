package JuegoCombate;

import java.io.*;

class GuardarJuego {
    public static void guardar(Juego juego) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("partidaGuardada.bin"))) {
            oos.writeObject(juego);
        }
    }

    public static Juego cargar() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("partidaGuardada.bin"))) {
            return (Juego) ois.readObject();
        }
    }
}