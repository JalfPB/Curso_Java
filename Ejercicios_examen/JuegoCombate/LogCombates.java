package JuegoCombate;

import java.io.*;

class LogCombates {
    public static void registrarCombate(String combate) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("combates_log.txt", true))) {
            bw.write(combate);
            bw.newLine();
        }
    }
}