package EjerciciosRepasoGeneral;

public class Ej6 {
    /*
     * Implementa dos versiones de un método que calcule el factorial de un número,
     * una usando recursión y otra con un bucle.
     */

    static int factorialRecursion(int n) {
        if (n == 0)
            return 1; // caso base
        else
            return n * factorialRecursion(n - 1); // caso general
    }

    static int factorialBucles(int n) {
        int aux = n;

        while (aux - 1 != 0) {
            if (aux - 1 != 0) {
                aux = aux - 1;
                //System.out.println(n + " * " + aux + " = " + (n * aux));
                n = n * aux;
            }

        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(factorialBucles(5));
        System.out.println(factorialRecursion(5));
    }

}
