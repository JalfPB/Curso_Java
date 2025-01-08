package SupuestoPractico.Ej6;

public class Pantalon extends Prenda {
    public Pantalon(double precioBase, String estado) {
        super(precioBase, estado);
    }

    @Override
    public String getTipo() {
        return "Pantalón";
    }
}
