package Datos_Colecciones.Map;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo {

    public static void main(String[] args) {
        Map<String, Integer> letras = new HashMap<>();

        letras.put("Hola", 1);
        System.out.println(letras);
    }

}
