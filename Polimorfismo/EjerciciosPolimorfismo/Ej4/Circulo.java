package Polimorfismo.EjerciciosPolimorfismo.Ej4;

public class Circulo extends Figura{
    double radio;

    public Circulo(String color,double radio){
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){

        double area = Math.PI * Math.pow(radio, 2);
        return area;

    }

}
