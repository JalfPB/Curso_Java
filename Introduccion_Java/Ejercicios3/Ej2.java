package Ejercicios3;

public class Ej2 {
    //Implementa un método que, dado un número entero, calcule el cubo.
    static void calcularCubo(int n) {
        int cubo = (int)Math.pow(n,3);
        System.out.println("El cubo de " + n + " es " + cubo);
    }

    public static void main(String[] args) {
        int n = 3;
        calcularCubo(n);
    }

}
