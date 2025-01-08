package JuegoRol;

import java.util.HashMap;
import java.util.Map;

class Mapa {
    Map<String, String[]> territorios;

    public Mapa() {
        territorios = new HashMap<>();
        territorios.put("Aldea", new String[] {"Bosque", "Montaña"});
        territorios.put("Bosque", new String[] {"Aldea", "Río"});
        territorios.put("Montaña", new String[] {"Aldea"});
    }

    public void mostrarRutas(String territorio) {
        System.out.println("Desde " + territorio + " puedes ir a: ");
        for (String ruta : territorios.get(territorio)) {
            System.out.println("- " + ruta);
        }
    }
}