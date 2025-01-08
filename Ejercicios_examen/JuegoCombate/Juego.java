package JuegoCombate;
import java.util.*;


class Juego {
    Map<String, Boolean> estadoTerritorios;

    public Juego() {
        estadoTerritorios = new HashMap<>();
    }

    public void agregarTerritorio(Territorio territorio) {
        estadoTerritorios.put(territorio.nombre, territorio.conquistado);
    }

    public boolean verificarTerritorio(String nombre) {
        return estadoTerritorios.getOrDefault(nombre, false);
    }
}