package Examen.Ej8;

public class Libro {

    String titulo;
    String autor;
    int numPaginas;

    // Constructor para titulo y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor para todos los atributos
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void imprimirDetalles(){
        System.out.println("Detalles del libro: [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]" );
    }

    // Metodo sobrescrito que muestra los detalles solo si no supera el limite de paginas
    public void imprimirDetalles(int limitePaginas){
        if(numPaginas<limitePaginas)
        System.out.println("Detalles del libro: [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]" );
    }

}
