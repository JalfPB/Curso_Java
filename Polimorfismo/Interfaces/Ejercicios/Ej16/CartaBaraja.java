package Polimorfismo.Interfaces.Ejercicios.Ej16;

public enum CartaBaraja {

    CORAZONES,
    DIAMANTES,
    TREBOLES,
    ESPADAS;

    public void mostrarPalo(){
        System.out.println("El palo es " + this);
    }

}
