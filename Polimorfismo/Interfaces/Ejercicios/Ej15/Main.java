package Polimorfismo.Interfaces.Ejercicios.Ej15;

public class Main {
    public static void main(String[] args) {
        double cantidad = 100;

        double dolaresAEuros = Moneda.DOLAR.convertirA(cantidad, Moneda.EURO);
        System.out.println(cantidad + " Dólares a Euros: " + dolaresAEuros);

        double eurosAYenes = Moneda.EURO.convertirA(cantidad, Moneda.YEN);
        System.out.println(cantidad + " Euros a Yenes: " + eurosAYenes);

        double yenesADolares = Moneda.YEN.convertirA(cantidad, Moneda.DOLAR);
        System.out.println(cantidad + " Yenes a Dólares: " + yenesADolares);
    }
}

