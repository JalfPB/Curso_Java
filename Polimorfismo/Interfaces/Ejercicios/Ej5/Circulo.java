package Polimorfismo.Interfaces.Ejercicios.Ej5;

public class Circulo implements Medidas{

    private double radio;

    public Circulo(int radio){
        this.radio = radio;
    }

    public void calcularArea(){
        System.out.println(PI * radio * radio);
    }

}
