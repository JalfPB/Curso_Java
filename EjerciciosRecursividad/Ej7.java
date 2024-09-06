package EjerciciosRecursividad;

public class Ej7 {
    // Crea un método que obtenga la suma de los números naturales desde 1 hasta N.
    // Se debe
    // pasar como parámetro el número N, debe ser mayor que cero. Se debe imprimir
    // toda la
    // cadena por consola. Por ejemplo, para N=4 → ( 1+2+3+4 = 10).
    static int suma = 0;

    static int sumaNaturales(int n) {

        if (n > 0) {
            suma += n;
            System.out.println(suma);
            return sumaNaturales(n - 1);
        }

        else
            return suma;
    }

    public static void main(String[] args) {
        sumaNaturales(3);
    }

}
