package Polimorfismo.EjerciciosPolimorfismo.Ej4;

public class Main {

    public static void main(String[] args) {
        Figura circulo = new Circulo("amrillo", 5);
        Figura rectangulo = new Rectangulo("verde", 5, 8);

        System.out.println(circulo.calcularArea());
        System.out.println(rectangulo.calcularArea());
    }

}
