package Polimorfismo.Interfaces.Ejercicios.Ej15;

public enum Moneda {
    DOLAR(1.0),
    EURO(0.95),   
    YEN(149.0);   

    private final double tasaCambioDolar;

    Moneda(double tasaCambioDolar) {
        this.tasaCambioDolar = tasaCambioDolar;
    }

    public double getTasaCambioDolar() {
        return tasaCambioDolar;
    }

    public double convertirA(double cantidad, Moneda otraMoneda) {
        double cantidadEnDolares = cantidad / this.getTasaCambioDolar();
        return cantidadEnDolares * otraMoneda.getTasaCambioDolar();
    }
}

