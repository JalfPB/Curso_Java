package EjerciciosRepasoGeneral;

public class Ej1 {
    /*
     * Escribe un método que reciba un número n y devuelva la cantidad
     *  de números primos entre 1 y n. Usa bucles para comprobar si un
     *  número es primo y condicionales para contarlos.
     */

     static int primos(int n) {
        int total = 0;
        for (int i = 2; i <= n; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                //System.out.println(i + " / " + j + " = " + i % j);
                if (i % j == 0) {
                    contador++;
                    //System.out.println(i + " / " + j + " = " + i % j);
                }
            }
            if (contador == 2) {
                //System.out.println(i + " es Primo");
                total++;
            }
        }
        return total;
    }
    

    public static void main(String[] args) {

        System.out.println("El total de primos que hay hasta 10 es: " + primos(10));
        
    }

}
