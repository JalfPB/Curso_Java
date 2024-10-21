public class Coche extends Vehiculo{

    public Coche(String marca, String modelo, float velocidad) {
        super(marca, modelo, velocidad);
    }

    private int peso;

    public String seMueve(){
        return "El coche se mueve hacia adelante";
    }

}
