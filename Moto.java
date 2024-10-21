public class Moto extends Vehiculo {
    private int ruedas;

    public Moto() {
    }

    public Moto(String marca, String modelo, float velocidad, int ruedas) {
        super(marca, modelo, velocidad);
        this.ruedas = ruedas;
    }

    @Override
    public String seMueve() {
        return "La moto acelera";
    }
}
