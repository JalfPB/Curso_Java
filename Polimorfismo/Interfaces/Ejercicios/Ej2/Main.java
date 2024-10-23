package Polimorfismo.Interfaces.Ejercicios.Ej2;

public class Main {

    public static void main(String[] args) {
        Suma suma = new Suma();
        Multiplicar multi = new Multiplicar();

        suma.calcular(5, 5);
        multi.calcular(5, 5);
    }

}
