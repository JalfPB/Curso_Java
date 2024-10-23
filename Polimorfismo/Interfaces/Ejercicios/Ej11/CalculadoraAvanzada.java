package Polimorfismo.Interfaces.Ejercicios.Ej11;

public interface CalculadoraAvanzada {

    //public void calcular (int a, int b);

    private int sumar(int a, int b){
        return a + b;
    }
    private int restar(int a, int b){
        return a-b;
    }

    default void calcular(int a, int b) {

        System.out.println("Suma: " + sumar(a , b));
        System.out.println("Resta: " + restar(a,b));
    }

}
