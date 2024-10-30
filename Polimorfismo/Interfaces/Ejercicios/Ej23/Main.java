package Polimorfismo.Interfaces.Ejercicios.Ej23;

public class Main {

    public static void main(String[] args) {
        Mecanico m = new Mecanico();

        System.out.println(m.ruedas(TipoVehiculo.COCHE));
        System.out.println(m.ruedas(TipoVehiculo.CAMION));
        System.out.println(m.ruedas(TipoVehiculo.MOTO));
        System.out.println(m.ruedas(TipoVehiculo.BICICLETA));
    }

}
