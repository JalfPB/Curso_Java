package EjerciciosRepasoGeneral;

public class Ej5 {
    /*
     * 5- Crea un método recursivo que devuelva el n-ésimo número de la secuencia
     *  de Fibonacci. Luego, implementa otra versión que use bucles para generar
     *  la secuencia completa hasta n.
     */

     static int fibonacciRecursion(int n){
        // Caso base: F(0) = 0 y F(1) = 1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // retorna la suma de fibonacci(n - 1) y fibonacci(n - 2)
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
     }

     static void fibonacciBucle(int n){
        int a = 1;
        int b = 1;
        int x;

        System.out.print(a + " " + b);

        for(int i = 0; i <= n; i++){
            x = a + b;
            System.out.print(" " + x);
            a = b;
            b = x;

        }

     }

     public static void main(String[] args) {
        int x = 10;

        fibonacciBucle(x);
        System.out.println();
        System.out.println(fibonacciRecursion(x));


     }

}
