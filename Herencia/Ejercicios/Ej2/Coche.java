
public class Coche extends Vehiculo{

    public Coche(String marca, String modelo, float velocidad, int peso) {
        super(marca, modelo, velocidad);
        this.peso = peso;
    }

    private int peso;

    public String seMueve(){
        return "El coche se mueve hacia adelante";
    }

}
