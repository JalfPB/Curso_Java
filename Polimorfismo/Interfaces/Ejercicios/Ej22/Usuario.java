package Polimorfismo.Interfaces.Ejercicios.Ej22;

public class Usuario {

    public String obtenerMensajePermisos(NivelAcceso nivelAcceso) {
        switch (nivelAcceso) {
            case ADMINISTRADOR:
                return "Tienes todos los permisos";
            case USUARIO:
                return "Tienes permisos limitados";
            case INVITADO:
                return "No tienes permisos";
            default:
                return "Usuario no reconocido";
        }
    }

}
