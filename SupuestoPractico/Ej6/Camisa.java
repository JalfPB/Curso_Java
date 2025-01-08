package SupuestoPractico.Ej6;

public class Camisa extends Prenda {
    public Camisa(double precioBase, String estado) {
        super(precioBase, estado);
    }

    @Override
    public String getTipo() {
        return "Camisa";
    }
}
