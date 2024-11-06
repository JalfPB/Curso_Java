package Datos_Colecciones.HashMap;

import java.util.HashMap;

public class HashMapEjemplo {

    public static void main(String[] args) {
        // Crear un hashmap para almacenar pares clave-valor
        HashMap<String, Integer> edades = new HashMap<>();

        // Insertar pares clave-valor
        edades.put("Juan",25);
        edades.put("Maria", 30);
        edades.put("Pedro",28);

        // Acceder a un valor por su clave
        System.out.println("Edad de Juan: " + edades.get("Juan"));

        // Verificar si una clave existe
        if (edades.containsKey("Maria")); {
            System.out.println("La clave 'Maria' esta presente");
        }

        // recorrer el HashMap e imprimi las claves y valores
        for(String clave : edades.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " +
                                                    edades.get(clave));
        }

        // Eliminar una clave-valor
        edades.remove("Pedro");
        System.out.println("Despues de eliminar a Pedro: " + edades);
    }

}
