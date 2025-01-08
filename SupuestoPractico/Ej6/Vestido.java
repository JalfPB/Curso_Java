package SupuestoPractico.Ej6;

public class Vestido extends Prenda {
    public Vestido(double precioBase, String estado) {
        super(precioBase, estado);
    }

    @Override
    public String getTipo() {
        return "Vestido";
    }
}
