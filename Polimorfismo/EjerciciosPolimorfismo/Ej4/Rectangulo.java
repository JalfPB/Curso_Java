package Polimorfismo.EjerciciosPolimorfismo.Ej4;

public class Rectangulo extends Figura{

    double base;
    double altura;

    public Rectangulo(String color,double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){

        double area = base*altura;
        return area;

    }

}
