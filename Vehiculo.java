class Vehiculo {

    protected String marca;
    protected String modelo;
    protected float velocidad;

    public Vehiculo(String marca, String modelo, float velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public Vehiculo(){

    };

    public String seMueve(){
        return "El vehiculo se mueve";
    }

}
