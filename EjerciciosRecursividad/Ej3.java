package EjerciciosRecursividad;

public class Ej3 {
    // Crea un método que dado un número positivo, lo imprima invertido por
    // pantalla.

    static void invertir(int num) {
        // Caso base: si el número es menor que 10, imprime el dígito.
        if (num < 10) {
            System.out.print(num);
        } else {
            // Imprime el último dígito y luego llama recursivamente para el resto del número.
            System.out.print(num % 10);
            invertir(num / 10);
        }
    }
    

    public static void main(String[] args) {
        invertir(150);
    }

}
