package Ejercicios3;

public class Ej5 {
    //Implementa un método que dado un número diga si éste es par.
    static void esPar(int n){
        if(n % 2 == 0){
            System.out.println(n + " Es par");
        }else{
            System.out.println(n + " No es par");
        }
    }

    public static void main(String[] args) {
        esPar(5);
        esPar(6);
    }

}
