package Ejercicios4;

public class Ej17 {
    // Determina si un número de tres cifras es un número Armstrong.
    // Un numero armstrong es aquel numero que al separar sus dígitos, elevarlos a
    // la cuarta a cada uno y luego sumarlos dan el numero que eran loa dígitos
    // juntos. Ejemplo: 8028 es un numero armstrong ya que todos sus dígitos
    // elevados a la cuarta y luego sumarlos dan 8028.

    public static void main(String[] args) {
        int num = 153, r, sum = 0, armstrong = 0, aux;
        aux = num;

        if (num < 100 || num > 999) {
            System.out.println("Numero no valido");
        } else {
            while (aux > 0) {
                r = aux % 10;
                sum = (sum * 10) + r;
                aux = aux / 10;

                armstrong += Math.pow(r, 3);

                // System.out.println(r);
            }

            // System.out.println("El numero original " + num + "\nArmstrong " + armstrong);

            if (armstrong == num) {
                System.out.println(num + " es armstrong");
            } else {
                System.out.println(num + " No es armstrong");
            }

        }

    }
}
