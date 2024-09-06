package EjerciciosRecursividad;

public class Ej4 {
    // Crea un método que compruebe si un número es binario. Un número binario está
    // formado únicamente por ceros y unos.

    static int aux;

    public static boolean esBinario(int num) {
        // si el número es 0 es considerado binario
        if (num == 0) {
            return true;
        }

        // Verifica si el último dígito no es 0 ni 1
        int digito = num % 10;
        if (digito != 0 && digito != 1) {
            return false;
        }

        // Llamada recursiva eliminando el último dígito
        return esBinario(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(esBinario(101));
    }

}
