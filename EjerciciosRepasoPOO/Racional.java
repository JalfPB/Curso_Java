package EjerciciosRepasoPOO;

public class Racional {

    private int numerador;
    private int denominador;

    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int suma(){
        int suma = numerador + denominador;
        return suma;
    }

    public int resta(){
        int resta = numerador - denominador;
        return resta;
    }

    public int multiplicacion(){
        int mult = numerador * denominador;
        return mult;
    }

    public int division(){
        int div = numerador / denominador;
        return div;
    }

    public boolean iguales(){
        boolean iguales = false;
        if(numerador == denominador) iguales = true;
        return iguales;
    }

    

}
