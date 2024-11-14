package SupuestoPractico.Ej2;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        
        RedSocial rs = new RedSocial();
        Usuario usu = new Usuario("Alfon", "alfon@gmail.com");
        Usuario usu2 = new Usuario("Usuario2", "usuario2@gmail.com");
        Usuario usu3 = new Usuario("Pedro", "pedro@gmail.com");
        LocalDateTime fecha = LocalDateTime.now();

        usu.anadirAmigo(usu2);
        usu.anadirAmigo(usu3);
        usu2.anadirAmigo(usu3);

        usu.mostrarAmigos();

        rs.crearPublicacion(1, "Hola mundo!", usu, fecha);
        rs.crearComentario(1, new Comentario(usu3, "Hola"));
        rs.crearComentario(1, new Comentario(usu2, "Adios"));
        rs.mostrarPublicaciones();

        usu.eliminarAmigo(usu3);
        usu.mostrarAmigos();

    }

}
