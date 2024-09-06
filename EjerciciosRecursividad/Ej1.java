package EjerciciosRecursividad;

public class Ej1 {
    // Crea un método que obtenga la cantidad de dígitos de un número N mayor que
    // cero. Se debe pasar como parámetro el número N.

    static int obtenerDigitos(int num) {
        // Caso base: si num es menor que 10, tiene solo un dígito
        if (num < 10) {
            return 1;
        } else {
            // Llamada recursiva: añade 1 por el dígito actual y sigue con num/10
            return 1 + obtenerDigitos(num / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(obtenerDigitos(2000));
    }

}
