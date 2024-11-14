package SupuestoPractico.Ej2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {

    private int id;
    private String contenido;
    private Usuario autor;
    private LocalDateTime fecha;
    private List<Comentario> comentarios = new ArrayList<>();

    public Publicacion(int id, String contenido, Usuario autor, LocalDateTime fecha) {
        this.id = id;
        this.contenido = contenido;
        this.autor = autor;
        this.fecha = fecha;
    }

    public Publicacion(int id, String contenido, Usuario autor, LocalDateTime fecha, List<Comentario> comentarios) {
        this.id = id;
        this.contenido = contenido;
        this.autor = autor;
        this.fecha = fecha;
        this.comentarios = comentarios;
    }

    public void mostrarPublicacion(){
        System.out.println("Autor: " + autor);
        System.out.println("Fecha: " + fecha);
        System.out.println("Contenido: ");
        System.out.println(contenido);
        System.out.println("\nComentarios: ");
        for(Comentario c : comentarios){
            System.out.println(c.toString());
        }
    }

    public void insertarComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Publicacion [id=" + id + ", contenido=" + contenido + ", autor=" + autor + ", fecha=" + fecha
                + ", comentarios=" + comentarios + "]";
    }

}
