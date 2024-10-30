package Polimorfismo.Interfaces.Ejercicios.Ej23;

public class Mecanico {

    public String ruedas(TipoVehiculo tv){
        switch (tv) {
            case COCHE:
                return "Tiene 4 ruedas";
            case MOTO:
                return "Tiene 2 ruedas";
            case CAMION:
                return "Tiene 4 ruedas";
            case BICICLETA:
                return "Tiene 2 ruedas";
            default:
                return "No se conoce el vehiculo";
        }
    }

}
