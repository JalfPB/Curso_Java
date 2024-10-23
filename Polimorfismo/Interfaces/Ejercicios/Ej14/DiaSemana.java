package Polimorfismo.Interfaces.Ejercicios.Ej14;

public enum DiaSemana {

    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;

    public void imprimirMensaje() {
        switch (this) {
            case LUNES:
                System.out.println("Es lunes, comienza la semana.");
                break;
            case MARTES:
                System.out.println("Es martes, segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Es miércoles, tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Es jueves, cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Es viernes, quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Es sábado, sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Es domingo, septimo dia de la semana");
                break;
        }
    }

}
