package Ejercicios3;

public class Ej4 {
    //Implementa un método que utilice el método anterior para que, dado un número, calcule su tabla de multiplicar del 1 al 10.
    static int multiplicar(int n1, int n2) {
        int total = n1 * n2;
        //System.out.println(" La multiplicacion de " + n1 + " * " + " n2 es: " + total);
        return total;
    }

    static void tablaMultiplicar(int n) {
        int resul;
        for(int i = 1; i<=10;i++){
            resul = multiplicar(n, i);
            System.out.println(n + " * " + i + " = " + resul);
        }
    }

    public static void main(String[] args) {
        tablaMultiplicar(5);
    }

}
