
public class Patinete extends Vehiculo{

    public Patinete(String marca, String modelo, float velocidad,int bateria) {
        super(marca, modelo, velocidad);
        this.bateria = bateria;
    }

    private int bateria;

    public String seMueve(){
        return "El patin acelera ligeramente";
    }

}
