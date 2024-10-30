package Polimorfismo.Interfaces.Ejercicios.Ej22;

public class Main {

    public static void main(String[] args) {
        Usuario usu = new Usuario();

        System.out.println(usu.obtenerMensajePermisos(NivelAcceso.ADMINISTRADOR));
        System.out.println(usu.obtenerMensajePermisos(NivelAcceso.USUARIO));
        System.out.println(usu.obtenerMensajePermisos(NivelAcceso.INVITADO));
    }

}
