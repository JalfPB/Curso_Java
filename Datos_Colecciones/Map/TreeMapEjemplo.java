package Datos_Colecciones.Map;
import java.util.TreeMap;

public class TreeMapEjemplo {

    public static void main(String[] args) {
        TreeMap<String, Double> notas = new TreeMap<>();

        // Añadimos notas de los alumnos
        notas.put("Pol", 9.8);  // {Pol=9.8}
        notas.put("Pep", 8.3);  // {Pep=8.3, Pol=9.8}
        notas.put("Tom", 7.0);  // {Pep=8.3, Pol=9.8, Tom=7.0}
        notas.put("Sam", 9.6);  // {Pep=8.3, Pol=9.8, Sam=9.6, Tom=7.0}
        notas.put("Pol", 6.5);  // {Pep=8.3, Pol=6.5, Sam=9.6, Tom=7.0}
        notas.put("Kal", 9.1);  // {Kal=9.1, Pep=8.3, Pol=6.5, Sam=9.6, Tom=7.0}

        // Mostramos la primera y última clave en el mapa
        System.out.println("Primero: " + notas.firstKey());  // Kal
        System.out.println("Último: " + notas.lastKey());    // Tom

        // Mostramos las entradas antes y después de "Sam"
        System.out.println("Antes de 'Sam': " + notas.headMap("Sam"));  // {Kal=9.1, Pep=8.3, Pol=6.5}
        System.out.println("Después de 'Sam': " + notas.tailMap("Sam"));  // {Sam=9.6, Tom=7.0}

        // Mostramos el submapa entre "Kal" y "Pol"
        System.out.println("Entre 'Kal' y 'Pol': " + notas.subMap("Kal", "Pol"));  // {Kal=9.1, Pep=8.3}

        // Mostramos las claves anteriores y posteriores a las especificadas
        System.out.println("Anterior a 'Pol': " + notas.lowerKey("Pol"));  // Pep
        System.out.println("Anterior a 'Kal': " + notas.lowerKey("Kal"));  // null
        System.out.println("Anterior a 'Tim': " + notas.lowerKey("Tim"));  // Sam
        System.out.println("Posterior a 'Pol': " + notas.higherKey("Pol"));  // Sam
    }
}
