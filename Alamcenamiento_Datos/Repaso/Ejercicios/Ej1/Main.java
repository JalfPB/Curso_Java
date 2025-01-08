package Alamcenamiento_Datos.Repaso.Ejercicios.Ej1;

public class Main {

    static int factorialRecursivo(int n){
        if (n > 1){
            return n * factorialRecursivo(n-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("El factorial de " + 5 + " es " + factorialRecursivo(5));
    }

}
