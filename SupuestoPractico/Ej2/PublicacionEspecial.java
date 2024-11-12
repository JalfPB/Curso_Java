package SupuestoPractico.Ej2;

import java.time.LocalDateTime;

public class PublicacionEspecial extends Publicacion{

    String privacidad;
    private int id;
    private String contenido;
    private Usuario autor;
    private LocalDateTime fecha;

    public PublicacionEspecial(int id, String contenido, Usuario autor, LocalDateTime fecha, String privacidad) {
        super(id, contenido, autor, fecha);
        this.privacidad = privacidad;
    }

    @Override
    public void mostrarPublicacion(){
        System.out.println("Autor: " + autor);
        System.out.println("Fecha: " + fecha);
        System.out.println("Privacidad: " + privacidad);
        System.out.println("Contenido: ");
        System.out.println(contenido);
    }

}
