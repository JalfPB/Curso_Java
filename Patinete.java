public class Patinete extends Vehiculo{

    public Patinete(String marca, String modelo, float velocidad) {
        super(marca, modelo, velocidad);
    }

    private int bateria;

    public String seMueve(){
        return "El patin acelera ligeramente";
    }

}
