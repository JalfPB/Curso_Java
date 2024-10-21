package EjerciciosRepasoGeneral;

public class Ej10 {
    /*
     * 10- Escribe un método recursivo que tome un número entero y devuelva
     *  la cantidad de dígitos que tiene. El caso base debe ser cuando el
     *  número es menor que 10.
     */

     static int contarDigitos(int n) {
        n = Math.abs(n);

        if (n < 10) {
            return 1;
        }

        return 1 + contarDigitos(n / 10);
    }

    public static void main(String[] args) {
        int numero = 12345;
        System.out.println("El numero " + numero + " tiene " + contarDigitos(numero) + " digitos.");
    }
}
