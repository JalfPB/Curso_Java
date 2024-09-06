package EjerciciosRecursividad;

public class Ej5 {
    // Crea un método que obtenga el número binario de un número N pasado como
    // parámetro.

    static void convertirBinario(int n) {
        if (n > 1) {
            // Llamada recursiva dividiendo el numero por 2
            convertirBinario(n / 2);
        }
        // Imprimir el resto de la division por 2
        System.out.print(n % 2);
    }
    

    public static void main(String[] args) {
        convertirBinario(10);
    }

}
