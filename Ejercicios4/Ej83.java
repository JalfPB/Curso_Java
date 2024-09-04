package Ejercicios4;

public class Ej83 {
    // Implementa un método que cuente cuántas palabras contiene cada string en un
    // array de cadenas y devuelva un array con esos conteos.
    static int[] contar(String[] cadenas) {
        int[] conteo = new int[cadenas.length];
        int n;

        for (int i = 0; i < cadenas.length; i++) {
            n = cadenas[i].split(" ").length;
            conteo[i] = n;
        }
        return conteo;
    }

    static void mostrar(int[] conteo) {
        for (int i = 0; i < conteo.length; i++) {
            System.out.println("La longiud de la cadena en la posicion " + i + " es " + conteo[i]);
        }
    }

    public static void main(String[] args) {
        String[] cadenas = { "hola buenos dias", "hello world", "Esto son cuatro palabras" };

        mostrar(contar(cadenas));
    }

}
