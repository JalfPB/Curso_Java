package SupuestoPractico.Ej2;

public class Comentario {

    Usuario autor;
    String contenido;
    public Comentario(Usuario autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
    }
    public Usuario getAutor() {
        return autor;
    }
    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    @Override
    public String toString() {
        return "Comentario [autor=" + autor + ", contenido=" + contenido + "]";
    }

}
