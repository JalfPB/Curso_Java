package Datos_Colecciones.Map;

import java.util.HashMap;

public class HashMapEjemplo {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Se añaden solo si no existen
        capitalCities.putIfAbsent("Canada", "Ottawa");
        capitalCities.putIfAbsent("England", "Cmbridge");

        System.out.println(capitalCities);
    }

}
